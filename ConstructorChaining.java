package LearningJAVABasicsToAdvance;

public class ConstructorChaining {
    String name;
    int empID;

    ConstructorChaining(){
        this(10); //this calls other one
    }

    ConstructorChaining(int empID){
        this("sj",empID); //this calls other constructor and pass certain type of data
    }
    ConstructorChaining(String name,int empID){
        this.name=name;
        this.empID=empID;
    }
    //this create chaining inside one class
}
