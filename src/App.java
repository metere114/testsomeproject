import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:\\Users\\Admin\\OneDrive\\Máy tính\\New folder\\Hangman.txt"));
        System.out.println(scanner.hasNext());
        System.out.println(scanner.nextLine());
    }
}
