
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woohoo
 */
public class View {

    void printName() {
        System.out.print("Name: ");
    }

    void printLatinName() {
        System.out.print("Name in Latin: ");
    }
    
    void printObservation() {
        System.out.print("Bird? ");
    }
    
    public void printQuestionMark() {
        System.out.print("? ");
    }
    
    public void printNotABird() {
        System.out.println("Not a bird!");
    }
    
    public void printAll(Map<Bird, Integer> obs) {
        for (Bird b : obs.keySet()) {
            System.out.println(b + ": " + obs.get(b) + " observations");
        }
    }
}
