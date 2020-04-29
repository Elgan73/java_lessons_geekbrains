package DeepJava.lesson2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j) {
        super("Error in " + i + " -> " + j);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
