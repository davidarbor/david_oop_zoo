import java.util.*;
/**
 * Created by h205p2 on 9/14/17.
 */
public class Tiger extends Animal{
    public Tiger(String name){
        super(name, "meat");
        this.name=name;
    }
    public void sleep(){
        System.out.println(name+" sleeps for 8 hours.");
    }
}