package Lesson.MyApp.Entity;

import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("Clouds")
    private String main;
    @SerializedName("description")
    private String description;

    public String getMain() {
        return main;
    }
    public String getDescription() {return description;}

    public void setMain(String main) {this.main = main;}
    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {
        return "Weather{" +
                "main='" + main + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
