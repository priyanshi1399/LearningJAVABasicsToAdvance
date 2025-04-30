package LearningJAVABasicsToAdvance;
@FunctionalInterface
interface A14{

    void show(int i);

}


public class Demo_Lambda1 {
    public static  void main(String [] args) {
        A14 obj = i -> System.out.println("In show" +  i);

        obj.show(9);
    }
}
