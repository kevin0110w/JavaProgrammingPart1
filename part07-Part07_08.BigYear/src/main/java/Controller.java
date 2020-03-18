
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
public class Controller {

    private Scanner reader;
    private Model m;
    private View v;

    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;
        this.reader = new Scanner(System.in);
    }

    public void add() {
        this.v.printName();
        String englishName = this.reader.nextLine();
        this.v.printLatinName();
        String latinName = this.reader.nextLine();
        this.m.addBird(englishName, latinName);
    }

    public void observation() {
        this.v.printObservation();
        String theBird = this.reader.nextLine();
        if (this.m.addAnObservation(theBird)) {

        } else {
            this.v.printNotABird();
        }
    }

    public void printAllBirds() {
        this.v.printAll(this.m.getAllBirdObservations());
    }

    public void start() {
        while (true) {
            this.v.printQuestionMark();
            String command = this.reader.nextLine();
            
            if (command.toLowerCase().equals("add")) {
                add();
            } else if (command.toLowerCase().equals("observation")) {
                observation();
            } else if (command.toLowerCase().equals("all")) {
                printAllBirds();
            } else if (command.toLowerCase().equals("one")) {
                one();
            } else {
                break;
            }
        }
    }

    public void one() {
        this.v.printObservation();
        String name = this.reader.nextLine();
        this.v.printAll(this.m.getABird(name));
    }
}
