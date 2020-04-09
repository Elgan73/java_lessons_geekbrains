package Lesson.MyApp.Entity;


public class Sys {
    private float sunrise;
    private float sunset;

    public float getSunrise() {
        return sunrise;
    }
    public float getSunset() {
        return sunset;
    }

    public void setSunrise(float sunrise) {
        this.sunrise = sunrise;
    }
    public void setSunset(float sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Sys{" +
                "sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }
}