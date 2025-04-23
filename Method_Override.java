package LearningJAVABasicsToAdvance;

class A3{

    public void show(){
        System.out.println("In A Show");
    }

    public void config(){
        System.out.println("In A Config");
    }

}
class B3 extends A3{

    //changes the definition
    public void show(){
        System.out.println("In B Show");
    }
}
public class Method_Override {
    public static void main(String [] args) {
        A3 obj = new B3();
        obj.show();
        obj.config();
    }
}
