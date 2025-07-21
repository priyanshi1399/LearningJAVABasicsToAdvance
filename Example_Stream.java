package LearningJAVABasicsToAdvance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Example_Stream {

    public static  void main(String [] args){
        List<Integer> nums= Arrays.asList(5,8,3,7,2);

        /*for(int n:nums){
            System.out.println(n);
        }*/

      //  Consumer<Integer> con= n-> System.out.println(n);


        nums.forEach(n-> System.out.println(n));


       /* int sum=0;
        for(int n:nums){
            if(n%2==0){
                n=n*2;
                sum=sum+n;
            }
        }
        System.out.println(sum);*/
    }
}
