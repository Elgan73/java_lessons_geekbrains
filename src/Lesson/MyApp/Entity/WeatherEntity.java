package Lesson.MyApp.Entity;

import java.util.ArrayList;

public class WeatherEntity {

    ArrayList<Object> weather = new ArrayList<>();
    Main MainObject;
    private float visibility;
    Wind WindObject;
    private float dt;
    Sys SysObject;
    private float timezone;
    private float id;
    private String name;
    private float cod;

    public Main getMain() {
        return MainObject;
    }
    public float getVisibility() { return visibility; }
    public Wind getWind() {
        return WindObject;
    }
    public float getDt() {
        return dt;
    }
    public Sys getSys() {
        return SysObject;
    }
    public float getTimezone() {
        return timezone;
    }
    public float getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getCod() {
        return cod;
    }

    public void setMain(Main mainObject) {
        this.MainObject = mainObject;
    }
    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }
    public void setWind(Wind windObject) {
        this.WindObject = windObject;
    }
    public void setDt(float dt) {
        this.dt = dt;
    }
    public void setSys(Sys sysObject) {
        this.SysObject = sysObject;
    }
    public void setTimezone(float timezone) {
        this.timezone = timezone;
    }
    public void setId(float id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCod(float cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "weather=" + weather +
                ", MainObject=" + MainObject +
                ", visibility=" + visibility +
                ", WindObject=" + WindObject +
                ", dt=" + dt +
                ", SysObject=" + SysObject +
                ", timezone=" + timezone +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}



