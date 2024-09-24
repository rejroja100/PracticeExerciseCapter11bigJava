import java.io.FileWriter;
import java.io.IOException;

public class Practice1 {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("Hello.txt");

            fileWriter.write("Hello world !!");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("the error is: " + e.getMessage());
        }


    }
}
