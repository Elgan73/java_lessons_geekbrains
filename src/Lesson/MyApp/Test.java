package Lesson.MyApp;

import Lesson.MyApp.Entity.Weather;
import Lesson.MyApp.Entity.WeatherEntity;
import Lesson.MyApp.MyView.MyWeather;
import Lesson.MyApp.Network.Network;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            MyWeather myWeather;
            myWeather = new MyWeather();
            myWeather.setTitle("OpenWeatherMap");
            myWeather.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            myWeather.setBounds(300, 200, 350, 100);
            myWeather.setVisible(true);
        });
    }
}
