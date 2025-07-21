package LearningJAVABasicsToAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static  void main(String [] args){

        List<String> names= Arrays.asList("Radha","Lakshmi","Priya");
        String name=names.stream()
                .filter(str->str.contains("x"))
                .findFirst()
                .orElse("Not Found");
       // System.out.println(name.orElse("Not Found"));

        System.out.println(name);
    }
}
