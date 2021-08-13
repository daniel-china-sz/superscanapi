package fu.dan.qi.superscan.api;

public class CameraException extends RuntimeException{
    public CameraException() {
        super();
    }

    public CameraException(String message) {
        super(message);
    }

    public CameraException(String message, Throwable cause) {
        super(message, cause);
    }

    public CameraException(Throwable cause) {
        super(cause);
    }
}
