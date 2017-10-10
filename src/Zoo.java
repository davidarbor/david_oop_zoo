import java.util.*;
/**
 * Created by h205p2 on 9/12/17.
 */
public class Zoo{
    public static void main(String[] args){
        Zoo z = new Zoo();
        Zookeeper zoebot=new Zookeeper("Zoebot");
        ArrayList<Animal> animals=new ArrayList<Animal>();
        Tiger shereKhan=new Tiger("Shere Khan");
        Bear baloo=new Bear("Baloo");
        Bee lightyear=new Bee("Lightyear");
        Giraffe melman=new Giraffe("Melman");
        Unicorn rainbow=new Unicorn("Rainbow");

        animals.add(shereKhan);
        animals.add(baloo);
        animals.add(lightyear);
        animals.add(melman);
        animals.add(rainbow);

        Animal.populationCount();

        shereKhan.sleep();
        shereKhan.eat("meat");
        baloo.sleep();
        baloo.eat("fish");
        lightyear.sleep();
        lightyear.eat("pollen");
        melman.sleep();
        melman.eat("leaves");
        rainbow.sleep();
        rainbow.eat("marshmallows");
        zoebot.feedAnimals(animals, "meat");
    }
}