package LearningJAVABasicsToAdvance;

public class OuterClass_StaticNestedClasses { //as this can not be private
    int instanceVariable=10;
    static int classVariable=20;

    private static class NestedClass{ //by making it private its object can be created in this class only.

        public void print(){
            System.out.println(classVariable);
        }
    }

    public void display(){
        NestedClass nestObj=new NestedClass(); //Make object of NestedClass in this method.
        nestObj.print();
    }



}
