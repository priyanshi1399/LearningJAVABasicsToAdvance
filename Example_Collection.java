package LearningJAVABasicsToAdvance;

import java.util.*;

public class Example_Collection {

    public static void main(String [] args){
        Collection<Integer> nums= new ArrayList<Integer>();
        //List<Integer> nums= new ArrayList<Integer>();
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(5);
        System.out.println(nums);
       /* Iterator<Integer> values=nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }*/
        Map<Integer,Integer> map=new HashMap<>();
        map.put(56,80);
        System.out.println(map.keySet());

    }
}
