package LearningJAVABasicsToAdvance;

class A5{

    public void show1(){
        System.out.println("In A Show");
    }

}
class B5 extends A5{
    public void show2(){
        System.out.println("In B Show");
    }
}

public class Demo5 {
    public static void main(String[] args) {
        /*A5 obj = (A5)new B5();
        obj.show1();*/

        A5 obj=new B5();
        obj.show1();

        B5 obj1=(B5) obj;
        obj1.show2();
    }
}
