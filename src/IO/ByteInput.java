package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteInput {

    public void copy() {
        try (FileInputStream fis = new FileInputStream("example.txt");
             FileOutputStream fos = new FileOutputStream("example_copy.txt")) {

            byte[] byteArray = new byte[16];

            int readed = fis.read(byteArray);
            while (readed != -1) {
                fos.write(byteArray, 0, readed);
                readed = fis.read(byteArray);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
