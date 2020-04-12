package Lesson.MyApp.MyView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class MyWeather extends JFrame {

    public MyWeather() {
        JButton btn;
        JTextField cityInput;
        String button = "ТЫК!";

        setContentPane(new BgPanel());
        Container cont = getContentPane();

        btn = new JButton(button);
        btn.setMargin(new Insets(10,20,10,20));
        cityInput = new JTextField(15);

        cont.setLayout(new GridBagLayout());

        cont.add(cityInput);
        cont.add(btn);

        if (cityInput.toString() != null) {
            btn.addActionListener(actionEvent -> {
                JFrame jFrame = new JFrame();
                jFrame.setSize(400, 400);
                jFrame.setVisible(true);
            });
        }




//        JFrame jFrame = new JFrame();
//        JButton jBtn = new JButton(button);
//        jBtn.setMargin(new Insets(20,40,20,40));
//        setLayout(new FlowLayout());
//        cityInput = new JTextField(20);
//        cityInput.setToolTipText("Input your city");
//        add(cityInput);
//        add(jBtn);
//
//            jBtn.addActionListener(actionEvent -> {
//                jFrame.setSize(500,500);
//                JLabel jLabel = new JLabel(new ImageIcon(myImage));
//                jFrame.add(jLabel);
//                jFrame.setVisible(true);
//            });

    }

}

class BgPanel extends JPanel{
    public void paintComponent(Graphics g){
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


