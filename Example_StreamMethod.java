package LearningJAVABasicsToAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example_StreamMethod {

    public static void main(String [] args){

        //Predicate<Integer> p=n -> n%2==0;

     /*   Function<Integer,Integer> fun=new Function<Integer,Integer>() {

            public Integer apply(Integer n) {
                return n= n*2;
            }
        };
        */

        Function<Integer,Integer> fun= n->  n= n*2;
        List<Integer> nums= Arrays.asList(1,3,5,7,8,2);

       /* int result=nums.stream()
                .filter(n -> n%2==0)
                .map(fun)
                .reduce(0,(c,e)->(c+e));
        */
        Stream<Integer> sortedValues=nums.stream().filter(n->n%2==0).sorted();
        sortedValues.forEach(n-> System.out.println(n));
        /*Stream<Integer> s1=nums.stream();
        Stream<Integer> s2= s1.filter(n->n%2==0);
        Stream<Integer> s3= s2.map(n->n*2);
        int result=s3.reduce(0,(c,e)->c+e);*/
        //  System.out.println(result);
        //s3.forEach(n->System.out.println(n));
        // s1.forEach(n->System.out.println(n));
        // s1.forEach(n->System.out.println(n));
    }
}
