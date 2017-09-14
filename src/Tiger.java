/**
 * Created by h205p2 on 9/14/17.
 */
public class Tiger {
    public String name;
    public String favoriteFood;
    public Tiger(String name, String favoriteFood){
        this.name=name;
        this.favoriteFood=favoriteFood;
    }
    public void sleep(){
        System.out.println(name+" sleeps for 8 hours.");
    }
    public void eat(String food){
        System.out.println(name+" eats "+food+".");
        if(food==favoriteFood){
            System.out.println("How did you know that "+food+" was "+name+"'s favorite food? Give him more.");
        }
    }
}
