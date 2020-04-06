package Lesson.grafics;

import javax.swing.*;
import java.awt.*;

public class MainProg {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MyWindow myWindow = new MyWindow();
            myWindow.setTitle("Cinema");
            myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            myWindow.setBounds(300,200,640,480);
            myWindow.setBackground(Color.RED);
            myWindow.setVisible(true);

        });
    }
}
