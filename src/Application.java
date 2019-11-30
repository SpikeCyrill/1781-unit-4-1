import IO.BufferedInput;

import java.io.IOException;
import java.util.Locale;

public class Application {

    public static void main(String[] args) throws IOException {
        /*ByteInput bInput = new ByteInput();
        bInput.copy();*/

        /*CharInput chInput = new CharInput();
        chInput.copy();*/

        BufferedInput bInput = new BufferedInput();
        bInput.copy();
        System.out.println(Locale.getDefault());
    }

}
