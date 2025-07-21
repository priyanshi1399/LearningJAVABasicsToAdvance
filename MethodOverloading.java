package LearningJAVABasicsToAdvance;

public class MethodOverloading {
    public static int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    //number of parameters
    public static int add(int n1,int n2){
        return n1+n2;
    }
    //here parameter type is changed
    public static double add(double n1,int n2){
        return n1+n2;
    }

    public static void main(String [] args){

        MethodOverloading md=new MethodOverloading();
        int r1=md.add(1,3,4);
        System.out.println(r1);
    }
}
