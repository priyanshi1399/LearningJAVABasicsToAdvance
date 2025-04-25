package LearningJAVABasicsToAdvance;

import com.sun.jdi.PathSearchingVirtualMachine;

interface A11{
   // int age=20; //final and static
    //String area="Punjab";

    public abstract void show();
    public abstract void config();
}
interface X{

    public abstract void run();
}

interface Y extends X{

}

class B11 implements A11,Y{


    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In config");
    }
    public void run() {
        System.out.println("In Run");
    }

}
public class Example_Interf {

    public static  void main(String [] args){
       // A11.area="Mumbai"; //will not work
        A11 obj;
        obj=new B11();
        obj.show();
        obj.config();

         X obj1=new B11();
         obj1.run();
       // System.out.println(A11.area);


    }
}
