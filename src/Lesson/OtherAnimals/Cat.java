package Lesson.OtherAnimals;

public class Cat extends Animal {

    private String name;
    private double jumpDistance;
    private int swimDistance;
    private int runDistance;
    String voice = "Мяу";

    public Cat(String name, double jumpDistance, int swimDistance, int runDistance) {
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
            System.out.println(" перепрыгнул");
        } else {
            System.out.println(name + " не перепрыгнул - будет шишка теперь");
        }

    }

    @Override
    public void swim(int a) {
        System.out.println("Котики не любят плавать");
    }

    @Override
    public void run(int a) {
        if (a <= runDistance) {
            System.out.println(name + " добежал");
        } else {
            System.out.println(name + " помер смертью храбрых");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name= " + name +
                ", jumpDistance= " + jumpDistance +
                ", swimDistance= " + swimDistance +
                ", runDistance= " + runDistance +
                ", voice= '" + voice + '\'' +
                '}';
    }
}
