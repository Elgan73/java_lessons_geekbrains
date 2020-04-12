package Lesson.MyApp.Network;

import Lesson.MyApp.Entity.Weather;
import Lesson.MyApp.Entity.WeatherEntity;
import com.google.gson.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Network {
    float tempC = 0;

    String apiKey = "6a1afe2c4b4602a65b173d2c2ce4d34d";
    String city = "Ульяновск";
    String goodRequestApi = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

    private static HttpURLConnection connection;

    public void getData() {
        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();
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
    }

}

