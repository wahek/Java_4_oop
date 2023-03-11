import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    FileWriter writer;

    public void setWriter(String text) {
        {
            try {
                writer = new FileWriter("TuskList.txt", false);
                writer.write(text);
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
