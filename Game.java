import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    private static ArrayList<String> lib = new ArrayList<>();

    public static void readWords() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("src\\Words.txt")));
            while (sc.hasNext()) {
                String word = sc.nextLine();
                lib.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
