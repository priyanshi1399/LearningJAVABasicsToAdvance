package LearningJAVABasicsToAdvance;
abstract class A10{

    public  abstract void show();

    public  abstract void config();
}

public class Example_AnyAbs {
    public static void main(String [] args){
        A10 obj=new A10(){ //this is the object of anonymous class

            public void show(){
                System.out.println("In new Show");
            }
            public void config(){
                System.out.println("In new config");
            }
        };
        obj.show();
        obj.config();
    }
}
