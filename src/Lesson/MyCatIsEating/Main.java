package Lesson.MyCatIsEating;

public class Main {
    public static void main(String[] args) {

        //Создаем массив котов
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 10, false);
        cat[1] = new Cat("Vaska", 5, false);
        cat[2] = new Cat("Dirana", 7, false);
        cat[3] = new Cat("Blinchik", 15, false);
        cat[4] = new Cat("Keks", 17, false);
        Plate c = new Plate(50);

        //этот метод добавляет еды в тарелку коту
//        c.addFood(20);

        // Коты жуть как жруть
        for (Cat i : cat) {
            System.out.println(i);
            i.eat(c);
            c.info();

        }

    }
}