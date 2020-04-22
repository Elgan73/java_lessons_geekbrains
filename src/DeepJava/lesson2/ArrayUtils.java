package DeepJava.lesson2;

import java.util.regex.Pattern;

public class ArrayUtils {


    public long arraySize(Object[][] myArray) {
        int sum = 0;

        if (myArray.length != 4) {
            throw new MySizeArrayException("its not 4x4 array");
        }


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt((String) myArray[i][j]);
                } catch (NumberFormatException nForm) {
                    throw new MyArrayDataException(i, j);
                }


            }

        }
        return sum;
    }
}
