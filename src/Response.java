import com.google.gson.JsonElement;

public class Response {
    private JsonElement body;
    private int statusCode;

    public Response(JsonElement body, int statusCode) {
        this.body = body;
        this.statusCode = statusCode;
    }

    public JsonElement getBody() {
        return body;
    }

    public int getStatusCode() {
        return statusCode;
    }
}