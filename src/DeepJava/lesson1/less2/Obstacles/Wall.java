package DeepJava.lesson1.less2.Obstacles;

import DeepJava.lesson1.less2.SomeObj.Obj;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean checkObst(Obj obj) {
        if (obj.jump() > height) {
            System.out.println(obj + " перепрыгнул " +  height + " метровую стену");
            return true;
        } else {
            System.out.println("Теперь у нас есть отпечаток " + obj + " на " + height + " метровой стене");
            return false;
        }
    }
}
