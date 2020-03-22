package Lesson;

public class lesson2 {

    public static int[] array = {1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0};

    public static void replaceNumbers(int[] array) {
        for (int i : array) {
            if (i == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.println(array[i]);
        }
    }

    public static void addNumbers() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[0] = 0;
            arr[1] = 3;
            arr[2] = 6;
            arr[3] = 9;
            arr[4] = 12;
            arr[5] = 15;
            arr[6] = 18;
            arr[7] = 21;
            System.out.println(arr[i]);
        }
    }

    public static void increaseNumbers() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i : arr) {

            if (i < 6) {
                i = i * 2;
            }
            System.out.print(i + ", ");
        }
    }
    
    public static void tableFunc() {

        int n = 5;
        int [][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        replaceNumbers(array);
        addNumbers();
        increaseNumbers();
        tableFunc();

    }
}
