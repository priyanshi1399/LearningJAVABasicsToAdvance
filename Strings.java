
package LearningJAVABasicsToAdvance;
import java.util.Locale;
import java.util.Scanner;
public class Strings {

    public static void main(String[] args) {
       /* String name = new String("harry");
        System.out.println("the name is: ");
        System.out.println(name);
        int a=6;
        float b=5.6454f;
        System.out.printf("The value of a is %d and the value of b is %f", a, b);
        System.out.format("The value of a is %d and the value of b is %f", a, b);
*/
       /* Scanner sc=new Scanner(System.in);
        String st=sc.nextLine(); //It takes whole Line.
        System.out.println(st);*/

        //String Methods

       String name="harry";
        /*System.out.println(name);
        int value=name.length();
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String ustring=name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString="           Priya    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim()); */

        /*System.out.println(name.substring(3)); //return from starts and till end
        System.out.println(name.substring(1,5)); //it excludes last one takes last-1
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r","ier"));
        System.out.println(name.startsWith("h"));
        System.out.println(name.endsWith("rry"));*/
       // System.out.println(name.charAt(3));
       // String modifiedname="Harryrry";
        //System.out.println(modifiedname.indexOf("rry"));
      //  System.out.println(modifiedname.indexOf("rry",4)); //from 4th onwards
      //  System.out.println(name.indexOf("rry")); //return first index
       /* System.out.println(modifiedname.indexOf("uuyg"));
        System.out.println(modifiedname.lastIndexOf("r"));
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("harRy"));
        System.out.println("Hello \t double quote");*/

        //Ques--
        String letter="Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>","Priyanshi"); //here need to assign
        System.out.println(letter);
//Ques
        String myString="This string contains  double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem

        String myLetter="Dear Priyanshi, \n\tThis Java course is nice\n\t, thanks!";
        System.out.println(myLetter);

    }
}
