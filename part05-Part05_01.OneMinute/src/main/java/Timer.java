/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woohoo
 */
public class Timer {
    private ClockHand hundrethsOfSecond;
    private ClockHand seconds;

    public Timer() {
        this.hundrethsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public String toString() {
        return this.seconds.toString() + ":" + this.hundrethsOfSecond.toString();
    }
    
    public void advance() {
        this.hundrethsOfSecond.advance();
        
        if (this.hundrethsOfSecond.value() ==0) {
            this.seconds.advance();
            
            
        }
    }
    
}
