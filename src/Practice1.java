import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("Hello.txt");

            fileWriter.write("Hello world !!");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("the error is: " + e.getMessage());
        }
            try (Scanner scanner = new Scanner(new File("Hello.txt"))){

                while (scanner.hasNextLine()){

                    String line = scanner.nextLine();
                    System.out.println(line);
                }

            } catch (FileNotFoundException e) {
                System.out.println("The error is " + e.getMessage());
            }

    }
}
