package LearningJAVABasicsToAdvance;
//example of concrete class as well
public class Person { //it can be public or not defined so that it will accessible to according to package
    int empID;

    Person(){

    }

    Person(int empID){
        this.empID=empID;
    }

    public int getEmpID(){
        return empID;
    }
}
