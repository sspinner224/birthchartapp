import com.google.gson.Gson;

import java.util.LinkedHashMap;

public class RequestFormParams {
    private LinkedHashMap<String, String> params;

    public RequestFormParams() {
        params = new LinkedHashMap<>();
    }

    public LinkedHashMap<String, String> getParams() {
        return params;
    }

    public void addParam(String key, String value) {
        params.put(key, value);
    }

    public String getParam(String key) {
        if (params.containsKey(key)) {
            return params.get(key);
        }
        return null;
    }

    public boolean doesParamExist(String key) {
        return params.containsKey(key);
    }

    public String toJsonString() {
        Gson gson = new Gson();
        return gson.toJson(params);
    }
}