package Lesson;

public class homework {
    public static void main(String[] args) {
        System.out.println("Hello dude!!!");
        System.out.println(plusMinus(1, 5, 2, 6));
        System.out.println(predel(100, 8));
        System.out.println(number(0));
        System.out.println(numberTwo(-20));
        System.out.println(hello("Александр"));
        System.out.println(yearV(1832));
    }

    public static int plusMinus(int a, int b, int c, int d) {
        int q;
        q = a * (b + (c / d));
        return q;
    }

    public static boolean predel(int a, int b) {
        int c;
        c = a + b;
        return c <= 20 && c >= 10;
    }

    public static String number(int a) {
        if (a >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    public static boolean numberTwo(int a) {
        return a < 0;
    }

    public static String hello(String a) {
        return "«Привет, " + a + "!»";
    }

    public static String yearV(int a) {
        if (a % 4 != 0) {
            return "Обычный";
        } else if (a % 100 == 0) {
            if (a % 400 == 0) {
                return "Високосный";
            } else {
                return "Обычный";
            }
        } else {
            return "Високосный";
        }
    }
}




