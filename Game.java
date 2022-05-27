import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    private static ArrayList<String> lib = new ArrayList<>();
    static String[][] board = new String[6][5];

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
        System.out.println("Welcome to Jordle! \n\n If the word contains the letter and is in the wrong position the" +
                " letter will be followed by a '*'.\n If the letter is not apart of the word, the letter will be " +
                "followed by a '-'.\n Start guessing! (type in all lowercase, thanks!)");
        int iniRow = 0;
        while (iniRow != 6) {
            String guess = sc.nextLine();
            for (int i = 0; i < wordToBeGuessed.length(); i++) {
                if (wordToBeGuessed.charAt(i) == guess.charAt(i)) {
                    board[iniRow][i] = String.valueOf(guess.charAt(i));
                } else if (wordToBeGuessed.contains(String.valueOf(guess.charAt(i)))) {
                    board[iniRow][i] = guess.charAt(i) + "*";
                } else {
                    board[iniRow][i] = guess.charAt(i) + "-";
                }
            }
            System.out.println(Arrays.deepToString(board));
            iniRow++;
        }
    }
}
