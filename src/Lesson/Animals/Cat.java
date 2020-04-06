package Lesson.Animals;

public class Cat extends Animal {

    protected int runRange = 200;
    protected int jumpRange = 2;
    protected int catWeight = 12;
    protected String voice = "Meow! Where is my food, Natasha?";
    protected String name = "Vaska";




    public void name() {
        System.out.println(name);
    }

    public void weight() {
        System.out.println("Vaska weight is " + catWeight + "kg");
    }

    @Override
    public void voice() {
        System.out.println(voice);
    }

    @Override
    public void run(int range) {

        if (range <= runRange) {
            System.out.println("Yep, cat was able to do it => " + true);
        } else {
            System.out.println("Cat can run only " + runRange + " meters");
        }
    }

    @Override
    public void swim(int range) {
        System.out.println("Cat not like to swim *hisses* ");

    }

    @Override
    public void jump(int range) {
        if (range <= jumpRange) {
            System.out.println("Yep, cat was able to do it");
        } else {
            System.out.println("Cat can jump only " + jumpRange + " meters => " + false);
        }
    }
}
