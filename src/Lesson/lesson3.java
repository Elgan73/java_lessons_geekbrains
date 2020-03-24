package Lesson;

import java.util.Scanner;

public class lesson3 {

    public void ugadaika() {
        int guessNumber, userNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("ЗАДАЧА: Угадать число (от 0 до 9).");

        guessNumber = (int) (Math.random() * 10);

        int counter = 0;

        boolean flag = true;

        while (flag) {

            counter++;

            System.out.println("Загаданное число: " + guessNumber);
            System.out.println("Введите ваше число: ");

            userNumber = input.nextInt();

            if (userNumber > 9 || userNumber < 0) {
                System.out.println("Вы ввели неправильное число,\nвведите число от 0 до 9");
            }
            if (userNumber > guessNumber) {
                System.out.println("много");
            } else if (userNumber < guessNumber) {
                System.out.println("мало");
            }

            if (userNumber == guessNumber) {
                System.out.println("Вы победили! Загаданное число: " + guessNumber);
                flag = false;
            }

            if (userNumber != guessNumber && counter == 3) {
                System.out.println("Вы проиграли =(");
                flag = false;
            }
        }
    }

    public static void main(String[] args) {
        lesson3 game = new lesson3();
        game.ugadaika();
    }
}
