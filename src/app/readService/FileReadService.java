package app.readService;

import utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadService {

    public String handleFile(String content, String fileName) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(Constants.PATH_OUT + fileName);
            byte[] byteArr = content.getBytes();
            fileOut.write(byteArr, 0, byteArr.length);
            fileOut.close();
        } catch (IOException ex) {

            return "\n\uD83D\uDE2D   Це помилка, щось таки поКрашилось \u2B07\uFE0F\n\n"
                    + ex.getMessage();
        }
        return "\nЗдається, у нас вийшло, біжи дивитись файл \uD83D\uDE0E";
    }


}
