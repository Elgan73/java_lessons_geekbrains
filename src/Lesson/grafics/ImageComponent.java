package Lesson.grafics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ImageComponent extends JComponent {
    Graphics g;
    public ImageComponent() {

        try{
            String img = "https://www.belnovosti.by/sites/default/files/2020-01/19_12.jpg";
            Image image = ImageIO.read(new URL(img));

            g.drawImage(image, 10,10,null);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
