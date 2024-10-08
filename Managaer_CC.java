package LearningJAVABasicsToAdvance;

public class Managaer_CC extends Person_CC {
/* //example 1
    Managaer_CC(){
        super(); //this is hidden if you do not provide it will provide it will output the same thing
        System.out.println("Inside Manager constructor :no argument");
        //it goes to person class initialize it then it comes to Manager
        //whenever you cretae child constructor internally it invoke the parent constructor there is hidden super()

        //so super will say go and parent constructor.. So it is also known as chaining.
    }*/

    //Understanding Example 2
    int age;
    Managaer_CC(int empID,int age){
        super(empID);
        this.age=age; // I took responsibility og initializing it and parent taken responsibility of writing /initializing empID;
        System.out.println("inside manager class: no arg");
    }

    //so you have parameterized then you have to write super ,if not then no neeed to write
}
