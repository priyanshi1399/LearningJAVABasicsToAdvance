package LearningJAVABasicsToAdvance;

class Mobile{
    String brand;
    int price;
    String network;
    static String name; //so that it will be common to all teh object

    public void show(){
        System.out.println(brand +" " + price + " "+ name);
    }
}
public class Example_StaticV {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="apple";
        obj1.price=1500;
        obj1.name="SmartPhone";


        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=1900;
        obj2.name="SmartPhone";

        obj1.name="AdvancePhone";

        obj1.show();
        obj2.show();
    }

}
