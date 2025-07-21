package LearningJAVABasicsToAdvance;

public class ObjectTest2 {
public static void main(String[] args){

    OuterClass.NestedClass nestedObj=new OuterClass.NestedClass();
    nestedObj.print();

    //static class can be accessed by OuterClass.display() suppose display method()
    //static means that is associated with class it is associated with OuterClass


    //example of Inheritence in Nested Class creating Object
    OuterClass_InheritenceNestedClass outerClassObj=new OuterClass_InheritenceNestedClass();
    OuterClass_InheritenceNestedClass.InnerClass2  innerClass2Obj=outerClassObj.new InnerClass2();
    innerClass2Obj.display();

    //because it is nested class inside so first creating object of OuterClass then from that creating InnerClassObject
    //then calling display method
}

}
