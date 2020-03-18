
import java.util.ArrayList;
import java.util.HashMap;
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
public class Model {
    private Map<Bird, Integer> observations;

    public Model() {
        this.observations = new HashMap<>();
    }

    public void addBird(String englishName, String latinName) {
        Bird b = new Bird(englishName, latinName);
        if (!this.observations.containsKey(b)) {
            this.observations.put(b, 0);
        }
    }

    public boolean addAnObservation(String name) {
        for (Bird b : this.observations.keySet()) {
            if (sameName(b, name)) {
                int observations = this.observations.get(b);
                observations++;
                this.observations.put(b, observations);
                return true;
            }
        }
        return false;
    }

    public Map<Bird, Integer> getAllBirdObservations() {
        return this.observations;
    }

    
    public boolean sameName(Bird b, String name) {
        return b.getName().equals(name) || b.getLatinName().equals(name);
    }

    Map<Bird, Integer> getABird(String name) {
       Map<Bird, Integer> s = new HashMap<Bird, Integer>();
        for (Bird b : this.observations.keySet()) {
            if (sameName(b, name)) {
                s.put(b, this.observations.get(b));
                break;
            }
        }
        return s;
    }
}
