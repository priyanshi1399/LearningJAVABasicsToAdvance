package LearningJAVABasicsToAdvance;

 class A8{
    int age;

    public void show(){
        System.out.println("In show");
    }

    static class B8{
        public void config(){
            System.out.println("In Config");
        }
    }
}
public class Example_Inner {

    public static  void main(String [] args){
        A8 obj=new A8();
        obj.show();

        A8.B8 obj1= new A8.B8();
        obj1.config();

    }

}
