package Lesson.MyApp.Entity;


public class Main {
    private float temp;
    private float pressure;
    private float humidity;

    public float getTemp() {return temp;}
    public float getPressure() {
        return pressure;
    }
    public float getHumidity() {
        return humidity;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}