/**
 * CustomException
 */
public class CustomException extends Throwable{
    public CustomException(String message) {
        super(message);
    }
    public CustomException() {
        super("CustomException");
    }
}