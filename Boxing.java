package LearningJAVABasicsToAdvance;

public class Boxing {


    public static void main(String [] args){
        int num=7; //primitive data type
        Integer num1=num; //AutoBoxing

        System.out.println(num1);

        int num2=num1.intValue();//unboxing
        System.out.println(num2);
    }
}
