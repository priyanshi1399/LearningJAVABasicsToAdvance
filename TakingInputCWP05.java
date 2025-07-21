package LearningJAVABasicsToAdvance;


import java.util.Scanner;
public class TakingInputCWP05 {
    public static void main(String [] args){
        //System.out.println("Taking Input from User");
        Scanner  sc=new Scanner(System.in);
       /* System.out.println("Enter number 1: ");
        int a=sc.nextInt();
        System.out.println("Enter number 2: ");
        int b=sc.nextInt();

        System.out.println(sc.hasNextInt());
        int sum=a+b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum); */

        //float ab=sc.nextFloat();
        boolean b1=sc.hasNextInt();
        System.out.println(b1);

    }
}
