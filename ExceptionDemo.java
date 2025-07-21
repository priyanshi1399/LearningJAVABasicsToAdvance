package LearningJAVABasicsToAdvance;

public class ExceptionDemo {
    public void divide(int x,int y) {
        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Remaining code of divide() method");
        }
    }

    public static void main(String [] args){
        ExceptionDemo obj=new ExceptionDemo();
        obj.divide(50,0);

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at LearningJAVABasicsToAdvance.ExceptionDemo.divide(ExceptionDemo.java:5)
        //	at LearningJAVABasicsToAdvance.ExceptionDemo.main(ExceptionDemo.java:12)
    }
}
