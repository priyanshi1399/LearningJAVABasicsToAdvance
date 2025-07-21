package LearningJAVABasicsToAdvance;

class A{

}
class B{

}
/*class C extends A,B{

}
Multiple Inheritence*/


public class Demo2 {
    public static void main(String [] args){
    VeryAdvanceCalc obj=new VeryAdvanceCalc();
    int r1=obj.add(4,5);
    int r2=obj.sub(5,4);
    int r3=obj.multi(4,5);
    int r4=obj.div(5,4);
    double r5=obj.power(4,5);
    System.out.println(r1 +" "+ r2 + " "+ r3 + " "+ r4 +" "+ r5 +" ");


    }
}
