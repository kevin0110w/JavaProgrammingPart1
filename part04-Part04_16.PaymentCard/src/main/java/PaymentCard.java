/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woohoo
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (enoughMoney(2.6)) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (enoughMoney(4.6)) {
            this.balance -= 4.6;
        }
    }

    public void addMoney(double money) {
        if (money < 0) {
            return;
        }
        this.balance += money;
        if (balance > 150) {
            this.balance = 150.0;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public boolean enoughMoney(double charge) {
        return this.balance >= charge;
    }
}
