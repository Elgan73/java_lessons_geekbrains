package Lesson.Animals;

public class Risenshnaucer extends Dog {

    protected int runRange = 150;
    protected double jumpRange = 0.5;
    protected double swimRange = 30;
    protected int dogWeight = 8;
    protected String voice = "WOW";
    protected String name = "Keks";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDogWeight(int dogWeight) {
        this.dogWeight = dogWeight;
    }

    public int getDogWeight() {
        return dogWeight;
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
