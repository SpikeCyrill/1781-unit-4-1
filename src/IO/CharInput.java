package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharInput {

    public void copy() {

        try (FileReader fr = new FileReader("example.txt");
             FileWriter fw = new FileWriter("example_copy.txt")) {

            char[] charArray = new char[16];

            int readed = fr.read(charArray);

            while(readed != -1) {
                fw.write(charArray, 0, readed);
                readed = fr.read(charArray);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
