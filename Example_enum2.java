package LearningJAVABasicsToAdvance;

enum Status1{

    Running,Failed,Pending,Success;
}
public class Example_enum2 {
    public static  void main(String [] args){

        Status1 s=Status1.Running;
        if(s==Status1.Running){
            System.out.println("Running");
        }
        else if(s==Status1.Failed){
            System.out.println("Try Again");
        }
        else if(s==Status1.Pending){
            System.out.println("Please wait");
        }
        else{
            System.out.println("Done");
        }

    }
}
