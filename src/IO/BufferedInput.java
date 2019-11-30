package IO;

import java.io.*;

public class BufferedInput {

    public void copy() {
        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("example.txt"));
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("example_copy.txt"));
            String line = br.readLine();
            while (!line.isEmpty()) {
                bw.write(line);
                line = br.readLine();
            }
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
