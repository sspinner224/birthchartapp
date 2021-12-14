import java.util.LinkedHashMap;
import java.util.Map;

public class QueryParams {
    private LinkedHashMap<String,String> params;

    public QueryParams() {
        params = new LinkedHashMap<>();
    }

    public void addParam(String key, String value) {
        params.put(key, value);
    }

    public String toQueryString() {
        StringBuilder sb = new StringBuilder().append("?");

        for (Map.Entry<String,String> param : params.entrySet()) {
            sb.append(param.getKey()).append("=").append(param.getValue()).append("&");
        }
        String result = sb.toString();
        return result.substring(0, result.length() - 1);
    }
}