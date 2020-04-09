package Lesson.MyApp;

import Lesson.MyApp.Entity.WeatherEntity;
import com.google.gson.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Network {

    Constants constants = new Constants();
    private static HttpURLConnection connection;

    public void getData() {
        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();
        try {
            URL url = new URL(constants.goodRequestApi);
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
            System.out.println(responseContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
    }

//    public static String parse(String json) {
//
//    }

    public void getListEntities(String json){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        WeatherEntity entity;
//        List<WeatherEntity> list = new ArrayList<>();
//        JsonElement element = JsonParser.parseString(json);
        WeatherEntity entity = gson.fromJson(json, WeatherEntity.class);
//        Map<String, Object> map = gson.fromJson(json, Map.class);
//        for (String key : map.keySet()) {
//            entity = gson.fromJson(((JsonObject) element).get(key), WeatherEntity.class);
//            list.add(entity);
            System.out.println("Weather in this town " + entity.getName()
                    + ":\nTemp: " + entity.getMain().getTemp() + "\nWind: " + entity.getWind().getSpeed());
//        }
//        return null;
        System.out.println(entity);
    }

    public void getD() {

//        getListEntities(responseContent.toString());
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.thecatapi.com/v1/images/search")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }

}
