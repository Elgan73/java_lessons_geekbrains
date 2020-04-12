package Lesson.MyApp.MyView;

import Lesson.MyApp.Entity.WeatherEntity;
import Lesson.MyApp.Network.Network;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    Network network = new Network();
    public MainView () {
        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel();
        setContentPane(new BgPanel());
        Container cont = getContentPane();
        WeatherEntity weatherEntity = new WeatherEntity();
        network.getData();
        setTitle(weatherEntity.getName());

        cont.setSize(500,500);
        cont.setLayout(new FlowLayout());
        cont.add(jLabel);
        jLabel.setText("Говорила сегодня по скайпу с подругой из Германии");
    }


}

