import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src\\input.txt");
            Scanner scan = new Scanner(reader);
            PrintWriter out = new PrintWriter("src\\output.txt");

            while (scan.hasNextInt()) {
                out.println(scan.nextInt() + 1 + " ");
            }

            out.close();
            reader.close();
            scan.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}