
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
public class InputHandler {

    private Scanner reader;
    private Points p;

    public InputHandler(Points p) {
        this.reader = new Scanner(System.in);
        this.p = p;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int number = Integer.valueOf(this.reader.nextLine());
            
            if (number == -1) {
                System.out.println(this.p);
                break;
            }
            
            if (number > 100 || number < -1) {
                continue;
            }
            
            this.p.addPoint(number);
        }
    }

}
