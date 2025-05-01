package LearningJAVABasicsToAdvance;

class A15{

    public void show() throws ClassNotFoundException{


            Class.forName("LearningJAVABasicsToAdvance.Demoo");



    }
}
public class Example_DuckingException {

        static{
            System.out.println("class loaded");
        }
    public static  void main(String[] args) {
        A15 obj=new A15();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
