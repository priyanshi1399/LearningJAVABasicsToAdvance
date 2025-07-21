package LearningJAVABasicsToAdvance;

public class OuterClass_InnerClasses {

    int instanceVariable=10;
    static int classvariable=20;

    class InnerClass{

        public void print(){
            System.out.println(classvariable+instanceVariable);
        }
    }
}
//making Class Object-->OuterClass_InnerClasses see in ObjectClass
//first we need outer class object
//using the object of parent creating object of inner.

