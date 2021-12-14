import com.google.gson.Gson;

import java.util.LinkedHashMap;

public class RequestHeaders {
    private LinkedHashMap<String,String> headers;

    public RequestHeaders() {
        headers = new LinkedHashMap<>();
    }

    public LinkedHashMap<String, String> getHeaders() {
        return headers;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public String getHeader(String key) {
        if (headers.containsKey(key)) {
            return headers.get(key);
        }
        return null;
    }

    public boolean doesParamExist(String key) {
        return headers.containsKey(key);
    }

    public String toJsonString() {
        Gson gson = new Gson();
        return gson.toJson(headers);
    }
}