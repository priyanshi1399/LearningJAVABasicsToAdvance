package LearningJAVABasicsToAdvance;

public class TypePromotion {

    public static  void main(String [] args){
        int num=257;
        byte  k=(byte) num;
        System.out.println(k); //1
        byte a=10;
        byte b=30;

        int result=a*b;
        System.out.println(result);

    }
}
