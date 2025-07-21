package LearningJAVABasicsToAdvance;

enum Laptop3{

    MacBook(2500),XPS(1400),Microsoft,Surface(1900);

    Laptop3() {
        price=500;
        System.out.println("in default Constructor");
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop3(int price) {
        this.price = price;
        System.out.println("In Constructor");
    }
}
public class Demo_enum {
    public static  void main(String [] args){
   // Laptop3 lap= Laptop3.MacBook;
    //    System.out.println(lap.getPrice());
    Laptop3 lap=Laptop3.MacBook;
    lap.setPrice(1800);
    for(Laptop3 lap1: Laptop3.values()){


        System.out.println(lap1 + ":" + lap1.getPrice());
    }
    }
}
