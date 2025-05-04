package LearningJAVABasicsToAdvance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example_ParallelStream {

    public static  void main(String [] args){
        int size=10_1000;
        List<Integer> nums=new ArrayList<>(1000);

        Random ran=new Random();
        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }
       // System.out.println(nums);
       /* int sum1=nums.stream()
                .map(i->i*2)
                .reduce(0,(c,e)->(c+e));
        */
        long startSeq1=System.currentTimeMillis();
        int sum2=nums.stream()
                .map(i->{
                    try{
                        Thread.sleep(1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return i*2;
                })
                .map(i->{
                    try{
                        Thread.sleep(1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return i*2;
                }).mapToInt(i->i).sum();
        long endSeq1=System.currentTimeMillis();

        long startpara1=System.currentTimeMillis();
        int sum3=nums.parallelStream()
                .map(i->i*2)
                .mapToInt(i->i).sum();

        long endpara1=System.currentTimeMillis();
        System.out.println(sum2 + " : " + sum3);
        System.out.println("Seq :" +(endSeq1-startSeq1));
        System.out.println("Para :" +(endpara1-startpara1));
    }
}
