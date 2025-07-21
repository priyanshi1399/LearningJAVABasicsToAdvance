package LearningJAVABasicsToAdvance;

class A6{

    public void show() {
        System.out.println("In A show");
    }
}

class B6 extends A6{
    public void show() {
        System.out.println("In B show");
    }
}
class C6 extends A6{


}
public class DMD {
    public static  void main(String [] args){
    A6 obj=new A6();
    obj.show();

    obj=new B6();
    obj.show(); //now pointing to B's its new now referring to new address now
    }
}
