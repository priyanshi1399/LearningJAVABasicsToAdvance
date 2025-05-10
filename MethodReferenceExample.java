package LearningJAVABasicsToAdvance;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static  void main(String [] args){

        List<String> names= Arrays.asList("Rita","Hira","Utkarsh","Shekhar");

       // List<String> uNames=names.stream().map(i->i.toUpperCase()).toList();

        List<String> uNames=names.stream().map(String::toUpperCase).toList();
        uNames.forEach(System.out::println);
    }
}
