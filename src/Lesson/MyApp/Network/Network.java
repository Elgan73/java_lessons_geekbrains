package Lesson.MyApp.Network;

import Lesson.MyApp.Entity.WeatherEntity;
import Lesson.MyApp.MyView.MyWeather;
import com.google.gson.*;

import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Network {

    public float tempC;
    public float pressure;
    public float humidity;
    public String name;
    public float visibility;
    private static HttpURLConnection connection;


    public void getData() {
        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();
        String apiKey = "6a1afe2c4b4602a65b173d2c2ce4d34d";
        String goodRequestApi = "http://api.openweathermap.org/data/2.5/weather?q=Ульяновск&appid=" + apiKey + "&units=metric";
        try {
            URL url = new URL(goodRequestApi);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
                getListEntities(responseContent.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
    }

    public void getListEntities(String json){
        Gson gson = new Gson();
        WeatherEntity entity = gson.fromJson(json, WeatherEntity.class);
        tempC = entity.getMain().getTemp();
        visibility = entity.getVisibility();
        humidity = entity.getMain().getHumidity();
        pressure = entity.getMain().getPressure();
        name = entity.getName();
    }

}

