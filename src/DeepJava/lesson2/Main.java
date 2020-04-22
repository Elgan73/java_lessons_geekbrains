package DeepJava.lesson2;

public class Main {

    public static void main(String[] args) throws MyArrayDataException, MySizeArrayException  {
        ArrayUtils arrayUtils = new ArrayUtils();

        Object[][] a = {{5,"f",3,17}, {9,"a",1,12}, {8,"#",2,3}, {5,4,5,3}};
        Object[][] c = {{5,5,3,17}, {9,1,1,12}, {8,2,2,3}, {5,4,5,3}};
        Object[][] b = {{"5","$","3","17"}};
        String[][] d = {{"5","f","3","17"}, {"9","a","1","12"}, {"8","#","2","3"}, {"5","4","5","3"}};
        try {
            long s = arrayUtils.arraySize(d);
            System.out.println(s);
        } catch (MyArrayDataException | MySizeArrayException arrayDataError ) {
            arrayDataError.printStackTrace();
        }

    }
}
