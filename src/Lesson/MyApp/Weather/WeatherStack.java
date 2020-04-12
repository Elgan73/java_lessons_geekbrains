package Lesson.MyApp.Weather;


public class WeatherStack {

    Request RequestObject;
    Location LocationObject;
    Current CurrentObject;

    public Request getRequest() {
        return RequestObject;
    }

    public Location getLocation() {
        return LocationObject;
    }

    public Current getCurrent() {
        return CurrentObject;
    }

    public void setRequest(Request requestObject) {
        this.RequestObject = requestObject;
    }

    public void setLocation(Location locationObject) {
        this.LocationObject = locationObject;
    }

    public void setCurrent(Current currentObject) {
        this.CurrentObject = currentObject;
    }

    @Override
    public String toString() {
        return "WeatherStack{" +
                "RequestObject=" + RequestObject +
                ", LocationObject=" + LocationObject +
                ", CurrentObject=" + CurrentObject +
                '}';
    }
}

