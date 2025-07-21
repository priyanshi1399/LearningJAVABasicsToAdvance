package LearningJAVABasicsToAdvance;

class Phone{
    String brand;
    int price;
    String network;
    static String name; //so that it will be common to all teh object

    public void show(){
        System.out.println(brand +" " + price + " "+ name);
    }

    public static  void show1(Phone obj){
        System.out.println(obj.brand +" " + obj.price + " "+ name);
    }
}
public class Example_StaticM {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.brand="apple";
        obj1.price=1500;
        obj1.name="SmartPhone";


        Phone obj2 = new Phone();
        obj2.brand="Samsung";
        obj2.price=1900;
        obj2.name="SmartPhone";

        obj1.name="AdvancePhone";

        obj1.show();
        obj2.show();

      //  Phone.show(); // we can not call non static method by class name
        Phone.show1(obj2);
    }
}
