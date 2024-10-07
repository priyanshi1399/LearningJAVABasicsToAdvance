package LearningJAVABasicsToAdvance;

public class ConstructorOverload {

    String name;
    int empId;

    ConstructorOverload(String empName){
        name=empName;
        empId=0;
    }

    ConstructorOverload(String name,int empId){
        this.name=name; //this name is parameter
        this.empId=empId;  //this . refers to instance this object field instance variable name
        //
    }
}
