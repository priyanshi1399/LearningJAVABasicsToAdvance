package LearningJAVABasicsToAdvance;

enum Status{
    Running,Failed,Success,Waiting;
}
public class Example_enum {
    public static void main(String[] args) {
        int i = 5;
        //Status s = Status.Success;
        Status [] ss=Status.values();
        //System.out.println(ss);
        System.out.println(Status.Running.ordinal());
        for(Status s: ss){
            System.out.println(s.ordinal() + ":"+s);
        }

    }
}
