package LearningJAVABasicsToAdvance;

public class SB {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Priyanshi");
        System.out.println(sb.capacity());

        sb.ensureCapacity(30);
        System.out.println(sb.length());
    }
}
