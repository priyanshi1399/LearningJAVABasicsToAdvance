package LearningJAVABasicsToAdvance;

public class SomeOtherClass2 extends OuterClass_NonStaticInheritenceByDiff.InnerClass{
    //when you areb inheriteing the inner class and it is not static
   // first initiate the object of parent
    //when you craete constructor by default super invoked
    SomeOtherClass2(){
        //first create object of outerclass the invoke super
        new OuterClass_NonStaticInheritenceByDiff().super();
        //as you know when child class constructor invokes , it first invoke the constructor of parent
        //but here parent is InnerClass, so it can only be accessed by the object of subclass only.

    }

    public void display1(){
        display();
    }
}
