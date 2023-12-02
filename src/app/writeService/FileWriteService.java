package app.writeService;

import utils.Constants;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriteService extends JFrame{

    public String readFile(String file) {

        try(final BufferedReader br =
                    new BufferedReader(new InputStreamReader(
                            new FileInputStream(Constants.PATH_IN +
                                    file)))) {

            String str;
            StringBuilder stringBuilder = new StringBuilder();
            while ((str = br.readLine()) != null) {
                stringBuilder.append(str).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return "\n\uD83D\uDE2D   Це помилка, щось таки поКрашилось \u2B07\uFE0F\n\n"
                    + ex.getMessage();
        }
    }

    public FileWriteService() {
        super("Для настрою");
        ImagePanel imagePanel = new ImagePanel();
        add(imagePanel);
        setSize(463, 245);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

