package LearningJAVABasicsToAdvance;

public class PrivateConstructor {
    String name;
    int empId;

    private PrivateConstructor(){
        //by creating it private only this class has access to call a constructor
    }


    public static PrivateConstructor getInstance(){
        return new PrivateConstructor(); //means call a constructor create a constructor and return
        //anybody cant create an object they have to call this method//in mainnclass if we want to call private constructor then make this method static then dont need a object for it
        //by adding static to this method it can be accessed in class main this method will create and return there we save
    }
}
