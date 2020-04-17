package DeepJava.lesson1.less2;

import DeepJava.lesson1.less2.Obstacles.Obstacle;
import DeepJava.lesson1.less2.SomeObj.Obj;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tournament {
    private final String tournamentTitle;
    private Obstacle[] obstacles;
    private Obj[] obj;

    private final List<Obj> winners = new LinkedList<>();
    private final List<Obj> loosers = new LinkedList<>();



    public Tournament(String tournamentTitle) {
        this.tournamentTitle = tournamentTitle;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setObj(Obj... obj) {
        this.obj = obj;
    }

    public void startMortalCombat() {
        winners.clear();

        for (Obj i : obj ) {
            boolean good = passAllObstacle(i);
            if(!good) {
                System.out.println(i + " покинул битву");
                loosers.add(i);
            } else {
                winners.add(i);
            }
        }
    }

    public List<Obj> getWinners() {
        return winners;
    }
    public List<Obj> getLoosers() {return loosers; }

    private boolean passAllObstacle(Obj obj) {
        for(Obstacle obstacle : obstacles) {
            if (!obstacle.checkObst(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "tournamentTitle='" + tournamentTitle + '\'' +
                ", obstacles=" + Arrays.toString(obstacles) +
                ", obj=" + Arrays.toString(obj) +
                ", winners=" + winners +
                '}';
    }
}
