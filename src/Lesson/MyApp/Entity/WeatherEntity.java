package Lesson.MyApp.Entity;

import java.util.ArrayList;

public class WeatherEntity {

    Main main;
    private float visibility;
    Wind wind;
    private float dt;
    Sys sys;
    private float timezone;
    private float id;
    private String name;
    private float cod;

    public Main getMain() { return main; }
    public float getVisibility() { return visibility; }
    public Wind getWind() { return wind; }
    public float getDt() { return dt; }
    public Sys getSys() { return sys; }
    public float getTimezone() {  return timezone; }
    public float getId() { return id; }
    public String getName() { return name; }
    public float getCod() { return cod; }

    public void setMain(Main main) {this.main = main; }
    public void setVisibility(float visibility) { this.visibility = visibility; }
    public void setWind(Wind wind) { this.wind = wind; }
    public void setDt(float dt) { this.dt = dt; }
    public void setSys(Sys sys) { this.sys = sys;}
    public void setTimezone(float timezone) {  this.timezone = timezone; }
    public void setId(float id) {this.id = id;}
    public void setName(String name) { this.name = name; }
    public void setCod(float cod) { this.cod = cod; }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "Main=" + main +
                ", visibility=" + visibility +
                ", Wind=" + wind +
                ", dt=" + dt +
                ", Sys=" + sys +
                ", timezone=" + timezone +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}



