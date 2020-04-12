package Lesson.MyApp.Weather;

import java.util.ArrayList;

public class Current {
    private float temperature;
    ArrayList< Object > weather_icons = new ArrayList < Object > ();
    ArrayList < Object > weather_descriptions = new ArrayList < Object > ();
    private float wind_speed;
    private String wind_dir;
    private float pressure;
    private float humidity;
    private float visibility;


    public float getTemperature() {
        return temperature;
    }


    public float getWind_speed() {
        return wind_speed;
    }


    public String getWind_dir() {
        return wind_dir;
    }

    public float getPressure() {
        return pressure;
    }


    public float getHumidity() {
        return humidity;
    }


    public float getVisibility() {
        return visibility;
    }



    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }


    public void setWind_speed(float wind_speed) {
        this.wind_speed = wind_speed;
    }


    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }


    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }




    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "Current{" +
                "temperature=" + temperature +
                ", weather_icons=" + weather_icons +
                ", weather_descriptions=" + weather_descriptions +
                ", wind_speed=" + wind_speed +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", visibility=" + visibility +
                '}';
    }
}
