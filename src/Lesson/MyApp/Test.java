package Lesson.MyApp;

import Lesson.MyApp.Entity.WeatherEntity;
import com.google.gson.*;

import javax.swing.text.html.parser.Entity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Test {



    public static void main(String[] args) {

        Network network = new Network();
        WeatherEntity ent = new WeatherEntity();
        network.getData();
        System.out.println("!!!!! -> " + ent);

//        network.getListEntities(network.getData());

//        System.out.println(ent.getMain().getTemp());

    }






}
