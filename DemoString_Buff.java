package LearningJAVABasicsToAdvance;

public class DemoString_Buff {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Nisha");
        s1.append("Singh");
        s1.replace(0,5,"Manish");
        System.out.println(s1);

    }

}