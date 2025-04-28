package LearningJAVABasicsToAdvance;


enum Status2{

    Running,Failed,Pending,Success;
}
public class Example_enumSwitch {
    public static  void main(String [] args){

        Status2 s=Status2.Success;

        switch(s){

            case Running:
                System.out.println("In Running State");
                break;

            case Pending:
                System.out.println("In Pending State");
                break;

            case Failed:
                System.out.println("In failed State");
                break;

            default:
                System.out.println("Done");
                break;
        }

    }
}
