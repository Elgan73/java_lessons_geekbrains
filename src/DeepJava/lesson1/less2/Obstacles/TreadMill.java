package DeepJava.lesson1.less2.Obstacles;

import DeepJava.lesson1.less2.SomeObj.Obj;

public class TreadMill implements Obstacle {

    private int distance;

    public TreadMill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean checkObst(Obj obj) {
        if (obj.run() > distance) {
            System.out.println(obj + " пробежал " +  distance + " метровую дистанцию");
            return true;
        } else {
            System.out.println("Посмотрите на  " + obj + " - его скелет красиво украшает " + distance + " метровую дистанцию");
            return false;
        }
    }
}
