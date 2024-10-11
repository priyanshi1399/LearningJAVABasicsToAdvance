package LearningJAVABasicsToAdvance;

public class ObjectTest2 {
public static void main(String[] args){

    OuterClass.NestedClass nestedObj=new OuterClass.NestedClass();
    nestedObj.print();

    //static class can be accessed by OuterClass.display() suppose display method()
    //static means that is associated with class it is associated with OuterClass
}

}
