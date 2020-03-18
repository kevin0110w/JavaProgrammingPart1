
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared) {
        int priceOfThis = this.pricePerSquare * this.squares;
        int priceOfCompared = compared.pricePerSquare * compared.squares;
         int difference = priceOfThis - priceOfCompared;
         
         if (difference < 0) {
             return (difference * -1);
         } else {
             return difference;
         }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.squares * this.pricePerSquare) > (compared.squares * compared.pricePerSquare);
    }
}
