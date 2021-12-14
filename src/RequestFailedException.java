public class RequestFailedException extends RuntimeException  {
    private int statusCode;

    public RequestFailedException(String errorMessage, int statusCode) {
        super(errorMessage);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return  statusCode;
    }
}