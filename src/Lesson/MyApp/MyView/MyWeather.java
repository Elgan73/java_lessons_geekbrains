package Lesson.MyApp.MyView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class MyWeather extends JFrame {

public JTextField cityInput;
public String input;

    public MyWeather() {
        JButton btn;
        String button = "ТЫК!";

        setContentPane(new BgPanel());
        Container cont = getContentPane();

        btn = new JButton(button);
        btn.setMargin(new Insets(10, 20, 10, 20));
        cityInput = new JTextField(20);


        cont.setLayout(new GridBagLayout());
        cont.add(cityInput);
        cont.add(btn);

            btn.addActionListener(actionEvent -> {
                if (cityInput.getText().length() >= 3) {
                    input = cityInput.getText();
                    System.out.println(input);
                    MainView mainView = new MainView();
                    mainView.setBounds(400, 500, 500, 500);
                    mainView.setVisible(true);
                } else {
                    System.out.println("insert right city");
                }

            });

    }
}

class BgPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            URL imageUrl = new URL("https://i.pinimg.com/736x/2a/6a/f8/2a6af83280b131bd8b15ba9ae07c8c9b.jpg");
            im = ImageIO.read(imageUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(im, 0, 0, null);
    }
}


