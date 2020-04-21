package DeepJava.lesson2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(RuntimeException message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
