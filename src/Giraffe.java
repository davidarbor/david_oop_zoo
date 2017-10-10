import java.util.*;
/**
 * Created by h205p2 on 9/15/17.
 */
public class Giraffe extends Animal{
    public Giraffe(String name){
        super(name, "leaves");
        this.name=name;
    }
    public void sleep(){
        System.out.println(name+" sleeps for 8 hours.");
    }
    public void eat(String food){
        System.out.println(name+" eats "+food+".");
        if(food==favoriteFood){
            System.out.println("How did you know that "+food+" was "+name+"'s favorite food? Give them more.");
        }
        else{
            System.out.println("Hey! "+name+" won't eat "+food+".");
        }
    }
}
