package app.writeService;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics figure) {
        super.paintComponent(figure);
        Image image = new ImageIcon(Constants.PATH_PHOTO).getImage();
        figure.drawImage(image, 0, 0, this);
    }
}
