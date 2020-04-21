package DeepJava.lesson2;

import java.util.regex.Pattern;

public class ArrayUtils {

    public long arraySize(Object[][] myArray) throws MyArrayDataException, MySizeArrayException {

        int sum = 0;
        if (myArray.length != 4) {
            throw new MySizeArrayException("array not 4x4");
        }  else {
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    try {
                        Pattern p = Pattern.compile("^[a-z!@#$%^&*()]+]");
                        if (!myArray[i][j].equals(p)) {
                            sum = sum + Integer.parseInt((String) myArray[i][j]);
                        }
                    } catch (RuntimeException e) {
                        throw new MyArrayDataException(e);
                    }
                }
            }
        }
        return sum;
    }
}
