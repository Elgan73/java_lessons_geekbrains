package Lesson.MyApp.Entity;


public class Wind {
    private float speed;
    private float deg;

    public float getSpeed() {
        return speed;
    }
    public float getDeg() {
        return deg;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public void setDeg(float deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}