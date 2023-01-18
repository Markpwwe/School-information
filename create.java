import java.io.FileWriter;
import java.io.IOException;

public class create extends School {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("School Account.txt");
            writer.write("Hello, this is a test string being written to a text file.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
