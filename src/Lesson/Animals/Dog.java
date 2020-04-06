package Lesson.Animals;

public class Dog extends Animal {

    protected int runRange = 500;
    protected double jumpRange = 0.5;
    protected double swimRange = 50;
    protected int dogWeight = 15;
    protected String voice = "WOW";
    protected String name = "Rex";

    public void name() {
        System.out.println(name);
    }

    public void weight() {
        System.out.println(dogWeight);
    }

    @Override
    public void voice() {
        System.out.println(voice);
    }

    @Override
    public void run(int range) {
        if (range <= runRange) {
            System.out.println("Yep, " + name + " was able to do it => " + true);
        } else {
            System.out.println(name + " can run only " + runRange + " meters => " + false);
        }
    }

    @Override
    public void swim(int range) {
        if (range <= swimRange) {
            System.out.println("Yep, " + name + " was able to do it => " + true);
        } else {
            System.out.println("Dog can swim only " + swimRange + " meters => " + false);
        }

    }

    @Override
    public void jump(int range) {
        if (range <= jumpRange) {
            System.out.println("Yep, " + name + " was able to do it => " + true);
        } else {
            System.out.println(name + " can jump only " + jumpRange + " meters => " + false);
        }
    }
}
