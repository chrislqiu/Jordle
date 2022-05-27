import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    private static ArrayList<String> lib = new ArrayList<>();
    static String[][] board = new String[6][5];
    private String wordToBeGuessed = "";

    public static void readWords() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader
                    ("C:\\Users\\Chris\\IdeaProjects\\Jordle\\src\\Words")));
            while (sc.hasNext()) {
                String word = sc.nextLine();
                lib.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readWords();
        Scanner sc = new Scanner(System.in);
        int ranIndex = (int) (Math.random() * (lib.size() + 1) + 0);
        String wordToBeGuessed = lib.get(ranIndex);
        
    }
}
