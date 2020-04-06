package Lesson.grafics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class MyWindow extends JFrame {

    public MyWindow() {

        String[] namedButtons = {"Cat", "Dog", "Fish", "Bird", "Horse"};
        String[] urls = {"https://www.belnovosti.by/sites/default/files/2020-01/19_12.jpg",
                "https://post.healthline.com/wp-content/uploads/sites/3/2020/02/322868_1100-1100x628.jpg",
                "https://5.imimg.com/data5/HD/OF/MY-47947495/crown-tail-betta-fish-500x500.jpg",
                "https://www.allaboutbirds.org/guide/assets/photo/67385731-480px.jpg",
                "https://www.dentranch.com/TRESSAW.jpg"};
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton(namedButtons[i]);
        }
        setLayout(new GridBagLayout());
        add(jbs[0]);
        add(jbs[1]);
        add(jbs[2]);
        add(jbs[3]);
        add(jbs[4]);

        for (int i = 0; i < jbs.length; i++) {
            for (int j = 0; j < urls.length; j++) {
                int finalI = i;
                int finalJ = j;
                jbs[i].addActionListener(actionEvent -> {
                    if (finalI == finalJ) {
                        try {
                            Image image = ImageIO.read(new URL(urls[finalJ]));
                            JFrame jFrame = new JFrame();
                            jFrame.setSize(500, 500);
                            JLabel jl = new JLabel(new ImageIcon(image));
                            jFrame.add(jl);
                            jFrame.setVisible(true);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
    }
}


