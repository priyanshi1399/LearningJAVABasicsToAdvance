package LearningJAVABasicsToAdvance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example_UserInput {

    public static  void main(String [] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=sc.nextInt();
        System.out.println(num1);
        System.out.println("Enter a number");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
       // int num=System.in.read();
        int num=Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
    }
}
