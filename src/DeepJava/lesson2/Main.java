package DeepJava.lesson2;

public class Main {

    public static void main(String[] args) throws MySizeArrayException {
        ArrayUtils arrayUtils = new ArrayUtils();

        String[][] a = {{"5","f","3","17"}, {"9","a","1","12"}, {"8","#","2","3"}, {"5","4","5","3"}};
        String[][] b = {{"5","$","3","17"}};
        long s = arrayUtils.arraySize(a);
        System.out.println(s);
    }
}
