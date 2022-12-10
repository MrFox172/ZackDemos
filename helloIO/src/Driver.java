import java.io.*;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        try {
            Scanner fileReader = new Scanner(new File("src/movie"));
            while(fileReader.hasNext())
                System.out.println(fileReader.nextLine());
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
