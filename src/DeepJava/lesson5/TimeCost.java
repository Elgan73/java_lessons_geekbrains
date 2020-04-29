package DeepJava.lesson5;

import Lesson.MyApp.Entity.Sys;

import java.util.Arrays;

public class TimeCost {


    static final int size = 1000000;
    static final int h = size / 2;


    public static void time() {

        float[] arr = new float[size];
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        System.out.println("Time for filling in '1' = " + (System.currentTimeMillis() - a));
        long b = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("time for first formula calculation = " + (System.currentTimeMillis() - b));
    }

    public static void time2() {
        float[] arr = new float[size];
        long a = System.currentTimeMillis();
        float[] a1 = new float[size];
        float[] a2 = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("time for formula calculation(filling and calculation) = " + (System.currentTimeMillis() - a));
        long b = System.currentTimeMillis();

        new Thread(() -> {
            for (int i = 0; i < size; i++) {
                System.arraycopy(arr, 0, a1, 0, h);
                System.arraycopy(arr, h, a2, 0, h);
            }
        }).start();

        System.out.println("time for formula calculation(array copy) = " + (System.currentTimeMillis() - b));
        long c = System.currentTimeMillis();
        new Thread(() -> {
            for (int i = 0; i < size; i++) {
                System.arraycopy(a1, 0, arr, 0, h);
                System.arraycopy(a2, 0, arr, h, h);
            }
        }).start();

        System.out.println("time for formula calculation(array merger) = " + (System.currentTimeMillis() - c));



        System.out.println("Current time = " + (System.currentTimeMillis() - a));
    }

    public static void main(String[] args) {
        time();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        time2();
    }

}
