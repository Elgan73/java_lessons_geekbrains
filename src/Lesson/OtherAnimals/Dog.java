package Lesson.OtherAnimals;

public class Dog extends Animal {
    private String name;
    private double jumpDistance;
    private int swimDistance;
    private int runDistance;
    String voice = "Гав-Гав";

    public Dog(String name, double jumpDistance, int swimDistance, int runDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
        this.swimDistance = swimDistance;
        this.runDistance = runDistance;
    }



    @Override
    public void voice() {
        System.out.println(voice);
    }

    @Override
    public void jump(double a) {
        if (a <= jumpDistance) {
            System.out.println(name + " перепрыгнул");
        } else {
            System.out.println(name + " не перепрыгнул - будет шишка теперь");
        }
    }

    @Override
    public void swim(int a) {
        if (a <= swimDistance) {
            System.out.println(name + " доплыл");
        } else {
            System.out.println(name + " не доплыл - Галина Бланка Буль-Буль");
        }
    }

    @Override
    public void run(int a) {
        if (a <= runDistance) {
            System.out.println(name + " пришел первым");
        } else {
            System.out.println(name + " пошел на чебуреки");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name= " + name +
                ", jumpDistance= " + jumpDistance +
                ", swimDistance= " + swimDistance +
                ", runDistance= " + runDistance +
                ", voice= '" + voice + '\'' +
                '}';
    }
}
