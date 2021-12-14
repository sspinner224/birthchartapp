import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class HttpRequest {

    public static Response post(String endpoint, RequestFormParams params, RequestHeaders headers) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if (headers != null) {
                for (Map.Entry<String, String> keyValuePair : headers.getHeaders().entrySet()) {
                    conn.setRequestProperty(keyValuePair.getKey(), keyValuePair.getValue());
                }
            }

            conn.setRequestMethod("POST");

            if (params != null) {
                conn.setDoOutput(true);
                StringBuilder parameters = new StringBuilder();
                for (Map.Entry<String, String> keyValuePair : params.getParams().entrySet()) {
                    parameters.append(keyValuePair.getKey() + "=" + URLEncoder.encode(keyValuePair.getValue(), "UTF-8"));
                    parameters.append("&");
                }
                try( DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
                    wr.write( parameters.toString().getBytes( StandardCharsets.UTF_8 ));
                }
            }

            String response = extractResponseOutput(conn);
            int statusCode = conn.getResponseCode();
            if (!isStatusCodeSuccessful(statusCode)) {
                String errorMessage = extractErrorOutput(conn);
                throw new RequestFailedException("POST Request to " + endpoint + " failed: " + errorMessage, statusCode);
            }
            return new Response(convertResponseToJsonObject(response), statusCode);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static String extractResponseOutput(HttpURLConnection conn) {
        try {
            StringBuilder result = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                for (String line; (line = reader.readLine()) != null; ) {
                    result.append(line);
                }
            }
            return result.toString();
        } catch (IOException e) {
            return "";
        }
    }

    private static String extractErrorOutput(HttpURLConnection conn) {
        try {
            StringBuilder result = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()))) {
                for (String line; (line = reader.readLine()) != null; ) {
                    result.append(line);
                }
            }
            return result.toString();
        } catch (IOException e) {
            return "";
        }
    }

    private static JsonElement convertResponseToJsonObject(String response) {
        try {
            return JsonParser.parseString(response).getAsJsonObject();
        } catch (JsonParseException | IllegalStateException e) {
            try {
                return JsonParser.parseString(response).getAsJsonArray();
            } catch (JsonParseException | IllegalStateException e2) {
                return new JsonObject();
            }
        }
    }

    private static boolean isStatusCodeSuccessful(int statusCode) {
        return statusCode / 100 == 2;
    }
}