import java.util.*;
/**
 * Created by h205p2 on 9/15/17.
 */
public class Zookeeper{
    public String name;
    public Zookeeper(String name){
        this.name=name;
    }
    public void feedAnimals(ArrayList<Animal> animals, String food){
        System.out.println(name+" is feeding "+food+" to "+Animal.population+" of "+animals.size()+" animals.");
        System.out.println(name+" is feeding "+food+" to "+animals.size()+" animals.");
        for(int i=0; i<animals.size(); i++){
            animals.get(i).eat(food);
        }
    }
}
