package LearningJAVABasicsToAdvance;

public class Example_Exception2 {
    public static  void main(String [] args){

        int i=2;
        int j=0;
        String str=null;
        int [] arr=new int[5];


        try{
            System.out.println(str.length());
            j=18/i;
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide by Zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
