
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
public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printSelection();

            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    addJoke();
                    break;
                case "2":
                    drawJoke();
                    break;
                case "3":
                    listJokes();
                    break;
                case "X":
                    return;
            }
        }
    }

    private void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = this.scanner.nextLine();
        this.manager.addJoke(joke);
    }

    private void drawJoke() {
        String joke = this.manager.drawJoke();
        System.out.println(joke);
    }

    private void listJokes() {
        this.manager.printJokes();
    }

    private void printSelection() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

}
