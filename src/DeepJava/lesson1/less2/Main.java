package DeepJava.lesson1.less2;

import DeepJava.lesson1.less2.Obstacles.TreadMill;
import DeepJava.lesson1.less2.Obstacles.Wall;
import DeepJava.lesson1.less2.SomeObj.Cat;
import DeepJava.lesson1.less2.SomeObj.Human;
import DeepJava.lesson1.less2.SomeObj.Obj;
import DeepJava.lesson1.less2.SomeObj.Robot;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tournament tournament = create();
        System.out.println("Let the Mortal Combat begin!");
        System.out.println("Fight!");
        tournament.startMortalCombat();
        System.out.println("Your soul is mine!!!" + tournament.getLoosers());
        for(Obj winner : tournament.getWinners()) {
            System.out.println(winner);
        }
    }

    private static Tournament create() {
        Random rnd = new Random();

        Obj cat = new Cat("Belka", 100, 350);
        Obj human = new Human("Heralt", 200, 550);
        Obj robot = new Robot("Marvin", 10, 50);
        TreadMill treadMills = new TreadMill(rnd.nextInt(1000));
        Wall walls = new Wall(rnd.nextInt(200));

        Tournament tournament = new Tournament("Mortal Combat");
        tournament.setObj(cat, human, robot);
        tournament.setObstacles(treadMills, walls);

        return tournament;

    }
}
