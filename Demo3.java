package LearningJAVABasicsToAdvance;

class A1{


    public A1(){
        super();
        System.out.println("in A");
    }

    public A1(int n){
        super();
        System.out.println("in A int");
    }
}

class B1 extends A1{
    public B1(){

        super();
        System.out.println("in B");
    }

    public B1(int n){
        //super(n);
        this();
        System.out.println("in B int");
    }
}
public class Demo3 {
    public static void main(String [] args){
        B1 obj=new B1(5);
        //It calls the constructor for parent and its own class
    }

}
