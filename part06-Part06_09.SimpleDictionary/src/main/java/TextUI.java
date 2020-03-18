
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author woohoo
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                addWord();
            } else if (command.equals("search")) {
                searchWord();
            } else {
                System.out.println("Unknown command");
            }
        }

    }

    private void addWord() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.dict.add(word, translation);
    }

    private void searchWord() {
        System.out.print("To be translated: ");
        String wordToBeTranslated = scanner.nextLine();
        
        if (this.dict.translate(wordToBeTranslated) == null) {
            System.out.println("Word " + wordToBeTranslated + " was not found");
        } else {
            System.out.println("Translation: " + this.dict.translate(wordToBeTranslated));
        }
    }

}
