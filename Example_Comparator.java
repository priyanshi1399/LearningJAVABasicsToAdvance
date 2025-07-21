package LearningJAVABasicsToAdvance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example_Comparator {
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10>j%10){
                    return 1;
                }
                return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(63);
        nums.add(82);
        nums.add(29);
        nums.add(31);

      Collections.sort(nums,com);
        System.out.println(nums);
    }

}