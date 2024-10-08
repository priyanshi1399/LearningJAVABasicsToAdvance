package LearningJAVABasicsToAdvance;

public class Person_CC {
    /*Person_CC(){
        System.out.println("this is a person class: no arg");
    }
*/

    //Take another example of super

    int empID;
    Person_CC(int empID){
        this.empID=empID;
        System.out.println("This is person class: no arg");
    }


    //if your parent constructor dosent have argument then you dont have to specify super keyword.bec
    //because java will automatically specify this. like this Person_CC(){ }

    //if it is having parameterized constructor then super() will not work it will call parent so it will call Person_CC(){ } I have on
   // only this Parameterized constructor in my Manager_CC so we need to pass parameter in super as well like
   // super(empID);
}
