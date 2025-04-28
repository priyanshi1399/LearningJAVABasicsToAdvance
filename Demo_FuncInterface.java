package LearningJAVABasicsToAdvance;

@FunctionalInterface
interface A12{

    void show();

}
/*class B12 implements A12{

    public void show(){
        System.out.println("In show");
    }
}*/
public class Demo_FuncInterface {

    public static  void main(String [] args){

        A12 obj=new A12(){
            public void show(){
                System.out.println("In show");
            }
        };
       obj.show();


    }
}
