package Pattern;

import java.util.ArrayList;

/**
 * @author Victor Lavalle
 */
public class Observed {
    
protected ArrayList<Observer> observers;

 public Observed(){
 this.observers = new ArrayList<>();
 }

 public void notifyAll(int[] votos, String[] participantes){
   for(int i = 0; i < observers.size(); i++){
     observers.get(i).update(votos, participantes);
    }
 }

 public void addObserver(Observer o){
    observers.add(o);
 }

 public void removeObserver(Observer o){
    observers.remove(o);
 }
}
