package Lesson.OtherAnimals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Васька", 3, 20, 50);
        Cat cat1 = new Cat("Белка", 2, 2, 15);
        Cat cat2 = new Cat("Дира", 5, 15, 30);
        Dog dog = new Dog("Бобик", 1, 20, 300);
        Dog dog2 = new Dog("Полкан", 1.5, 25, 250);

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog);
        System.out.println(dog2);
        System.out.println();

        dog.run(301);
        dog2.jump(1.2);
        cat1.swim(5);
        cat2.voice();
        dog.voice();

    }


}
