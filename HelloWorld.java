import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class HelloWorld {
    public static void main(String[] args) {
        String text = "Привет, мир!, Hello Yana!";
        try (OutputStreamWriter writer = new OutputStreamWriter(System.out, StandardCharsets.UTF_8)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
