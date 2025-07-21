package LearningJAVABasicsToAdvance;

public class Example_Wrapper {

    public static  void main(String [] args){

        int num=7;
        Integer num1=num; //deprecated
        System.out.println(num1);

        int num2=num1.intValue(); //unboxing
        System.out.println(num2);

        String str="11";
        int num3=Integer.parseInt(str);
        System.out.println(num3);
    }
}
