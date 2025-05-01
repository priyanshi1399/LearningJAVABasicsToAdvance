package LearningJAVABasicsToAdvance;

class A16 extends  Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }

}
class B16 extends  Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}
public class Example_Thread {
    public static  void main(String [] args){

            A16 obj1=new A16();
            B16 obj2=new B16();

            obj1.start();
            obj2.start();

    }
}
