package Lesson.MyApp.MyView;

import Lesson.MyApp.Network.Network;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    Network net = new Network();
    MyWeather myWeather = new MyWeather();
    public MainView() {

        JLabel jLabel = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        jLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        jLabel2.setFont(new Font("Dialog", Font.PLAIN, 14));
        jLabel3.setFont(new Font("Dialog", Font.PLAIN, 14));
        jLabel4.setFont(new Font("Dialog", Font.PLAIN, 14));
        jLabel5.setFont(new Font("Dialog", Font.PLAIN, 14));
        setContentPane(new BgPanel());
        Container cont = getContentPane();
        cont.setSize(500, 200);
        cont.setLayout(new FlowLayout());
        cont.add(jLabel);
        cont.add(jLabel2);
        cont.add(jLabel3);
        cont.add(jLabel4);
        cont.add(jLabel5);
//        MyWeather myWeather = new MyWeather();
//        String cityInputText = myWeather.input;
//        System.out.println(cityInputText);
        net.getData();
        jLabel.setText(net.name);
        jLabel2.setText(String.valueOf(net.tempC));
        jLabel3.setText(String.valueOf(net.humidity));
        jLabel4.setText(String.valueOf(net.pressure));

    }


}


