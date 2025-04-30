package LearningJAVABasicsToAdvance;
class PriyanshiException extends RuntimeException {

    public PriyanshiException(String string){

        super(string);
    }
}

public class Example_Custom {

    public static void main(String [] args){

        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new PriyanshiException("I dont want divide by zero");
            }
        }
        catch(PriyanshiException e){
            System.out.println("thats default output"  + e);
        }
        catch (ArithmeticException e){
            System.out.println("divide by zero");
        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
