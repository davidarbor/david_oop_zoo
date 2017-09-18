import java.util.*;
/**
 * Created by h205p2 on 9/14/17.
 */
public class Bear extends Animal{
    public String name;
    public Bear(String name){
        super(name, "fish");
        this.name=name;
    }
    public void sleep(){
        System.out.println(name+" hibernates for 4 months.");
    }
}
