
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woohoo
 */
public class Suitcase {
    private List<Item> items;
    private int maximumWeight;
    

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public int totalWeight() {
        int weight = 0;
        
        for (Item i : this.items) {
            weight += i.getWeight();
        }
        return weight;
    }
    public void addItem(Item item) {
        
        
        if (item.getWeight() + totalWeight() <= maximumWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() { 
        
        if (this.items.isEmpty()) {
            return "no items + (0 kg)";
        }
        String w = this.items.size() + " item";
        if (this.items.size() > 1) {
            w += "s";
        }
        
        w += " (" + this.totalWeight() + " kg)";
        return w;
    }
    
    
    public void printItems() {
        for (Item i : this.items) {
            System.out.println(i);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item i = this.items.get(0);
        
        for (Item item : this.items) {
            if (item.getWeight() > i.getWeight()) {
                i = item;
            }
        }
        return i;
    }
}
