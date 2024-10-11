package LearningJAVABasicsToAdvance;

public class ObjectTest {

    public static void main(String[] args){

        ObjectTest obj=new ObjectTest();

        Object obj1=new Person(1); //this Object I haven't created it Object by default present in Java
        //Person dosent have any superclass but still I am able to hold reference
        Object obj2=new Audi(10);

        System.out.println(obj1.getClass()); //this will print obj1  is instance of which class
        System.out.println(obj2.getClass());// this will print obj2 is instance of which class



        //o/p-->class LearningJAVABasicsToAdvance.Person
        //class LearningJAVABasicsToAdvance.Audi

         /* this 2 lines to understand static nested classes as well shown in Objecttest2 also
        OuterClass.NestedClass  outernestedObj=new OuterClass.NestedClass();
        outernestedObj.print();
        */

        /* this is static Inner class
    OuterClass_InnerClasses outerClassObj=new OuterClass_InnerClasses(); //First we make Outer Object
    OuterClass_InnerClasses.InnerClass innerClassOBj=outerClassObj.new InnerClass(); //by this outerObj make InnerClassObj
    innerClassOBj.print(); //innerObject
*/

        //Invoking local Inner classes
        OuterClass_LocalInnerClass outerLocalInnerObj=new OuterClass_LocalInnerClass();
        outerLocalInnerObj.display(); //I have to call this display inside display it will create an object of localinnerclass and then print see in
        //see in LocalInnerclass. //object will be created inside this class only.

    }
}
//Somewhere you want to store the object and you dont know which one is Parent and you want to hold the object
//you can always hold the object in Parent that is Object and you can use it know which class it belongs to and perform certain operations.