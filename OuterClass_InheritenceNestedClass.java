package LearningJAVABasicsToAdvance;
//1. example of Inheritence In Nested Class
public class OuterClass_InheritenceNestedClass {

    int instancevariable=1;
    static int classvariable=2;

    class InnerClass1{

        int innerclass1=3;
    }

    class InnerClass2 extends InnerClass1{ //it inherited from InnerClass1
        int innerClass2=4;
        void display(){
            System.out.println(innerclass1+innerClass2+instancevariable+classvariable);
        }
    }
}
//See object how to craete check in Object2 Class