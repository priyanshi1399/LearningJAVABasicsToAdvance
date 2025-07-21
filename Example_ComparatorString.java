package LearningJAVABasicsToAdvance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example_ComparatorString {
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() > b.length()) {
                    return 1;
                }
                return -1;
            }
        };

        List<String> arr = new ArrayList<String>();
        arr.add("Ram");
        arr.add("Shekhar");
        arr.add("Priyanshi");
        arr.add("Sharma");
        arr.add("Singh");

        Collections.sort(arr, com);
        System.out.println(arr);
    }
}
