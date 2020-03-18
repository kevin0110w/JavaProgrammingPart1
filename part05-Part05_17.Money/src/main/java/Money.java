
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();

        return new Money(euros, cents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros()) {
            return false;
        } else if (this.euros == compared.euros()) {
            if (this.cents > compared.cents()) {
                return false;
            } else {
                return true;
            }
        }

        return true;
    }

    public Money minus(Money decreaser) {
        int conversionOfThis = (this.euros * 100) + this.cents;
        int conversionOfThat = (decreaser.euros() * 100) + decreaser.cents();

        int difference = conversionOfThis - conversionOfThat;

        if (difference <= 0) {
            return new Money(0, 0);
        }

        int newCents = difference % 100;
        int newEuros = 0;
        
        if (difference >= 100) {
            newEuros = (difference - newCents) / 100;
        }

        return new Money(newEuros, newCents);
    }
}
