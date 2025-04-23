package LearningJAVABasicsToAdvance;

import java.sql.SQLOutput;

class Mobilee{
    String brand;
    int price;
    String network;
    static String name; //so that it will be common to all teh object



    public Mobilee(){
    brand="";
    price=200;
        System.out.println("In constructor");
    //name="Smart";
    }

    static{
        name="Phone";
        System.out.println("In static block");
    } //will be called only once
    public void show(){
        System.out.println(brand +" " + price + " "+ name);
    }


}
public class Example_StaticB {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("LearningJAVABasicsToAdvance.Mobilee");
      /*  Mobilee obj1 = new Mobilee();
        obj1.brand="apple";
        obj1.price=1500;
        obj1.name="SmartMobilee";

        Mobilee obj2 = new Mobilee();*/


    } 
    
}
