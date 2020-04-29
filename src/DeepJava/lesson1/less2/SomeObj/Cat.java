package DeepJava.lesson1.less2.SomeObj;

public class Cat implements Obj {

    private String name;
    private int jumpDistance;
    private int runDistance;

    public Cat(String name, int jumpDistance, int runDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
    }


    @Override
    public int jump() {
        return jumpDistance;
    }

    @Override
    public int run() {
        return runDistance;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                ", runDistance=" + runDistance +
                '}';
    }
}
