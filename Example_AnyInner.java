package LearningJAVABasicsToAdvance;
class A9{

    public void show(){
        System.out.println("In A Show");
    }
}
public class Example_AnyInner {
    public static void main(String[] args) {
        A9 obj = new A9(){
            public void show(){
                System.out.println("in B Show");
            }
        };
        obj.show();
    }

}
