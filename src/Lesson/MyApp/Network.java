package Lesson.MyApp;

import Lesson.MyApp.Entity.WeatherEntity;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Network {

    Constants constants = new Constants();
    private static HttpURLConnection connection;

    public String bla() {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
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
                getListEntities(responseContent.toString());
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);

                }

                reader.close();
            }
            System.out.println(responseContent.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
        return responseContent.toString();
    }
    public List<WeatherEntity> getListEntities(String json){
        Gson gson = new Gson();
        WeatherEntity entity;
        List<WeatherEntity> list = new ArrayList<>();
        String aaa = bla();
        JsonElement element = JsonParser.parseString(aaa);
        Map<String, Object> map = gson.fromJson(json, Map.class);
        for (String key : map.keySet()) {
            entity = gson.fromJson(((JsonObject) element).get(key), WeatherEntity.class);
            list.add(entity);
            System.out.println("Weather in this town " + entity.getName()
                    + ":\nTemp: " + entity.getMain().getTemp() + "\nWind: " + entity.getWind().getSpeed());
        }
        return list;
    }


//        getListEntities(responseContent.toString());
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url.toString())).build();
//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();

}
