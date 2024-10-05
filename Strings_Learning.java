package LearningJAVABasicsToAdvance;

public class Strings_Learning {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello"; //here both will point  to same s1 and s2 //this hello is string literal
        String s3=new String("hello");
        System.out.println(s1==s2); //it checks if both points to same memory yes

        System.out.println(s1.equals(s2)); //it checks the value inside strings
        System.out.println(s1.equals(s3)); //it checks the value so returns true
        System.out.println(s1==s3); //here by new keyword it will not point to same memory so return false
    }
}
