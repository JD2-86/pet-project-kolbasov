package by.kolbasov;

public class CustomException extends RuntimeException{


    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }
}
