import java.util.Locale;
import java.util.Scanner;

public class theWordsMain {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Skriv in dina ord här");
        theWordsEngine aWord = new theWordsEngine();
        String input = s1.nextLine().toLowerCase(Locale.ROOT);

        while (aWord.setStop(input)) {
            aWord.setRowCounter();
            aWord.setCharCounter(input);
            input = s1.nextLine().toLowerCase(Locale.ROOT);
        }
        System.out.println("Du skrev " + aWord.getCharCounter() +
                " tecken på " + aWord.getRowCounter() + " rader,  " +
                aWord.getWordCounter() + " ord och det längsta ordet var "
                + aWord.getLongestWord());
    }
}