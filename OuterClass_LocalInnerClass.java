package LearningJAVABasicsToAdvance;

public class OuterClass_LocalInnerClass {

    int instanceVariable=1;
    static int classVariable=2;

    public void display(){
        int methodLocalvariable=3; //variable inside block;

        class LocalInnerClass{ //there is no point of creating public because you have private only scope is within blockk only.
            int localInnerVariable=4;

            public void print(){
                System.out.println(instanceVariable+classVariable+methodLocalvariable+localInnerVariable);
                //here it can access all the variable
            }
        }

        LocalInnerClass localObj=new LocalInnerClass();
        localObj.print(); //here inside this block/within this block it can  only be initiated. it is local to this method
    }
}
//whenever you create a method  you get one block of this method life of this,, as soon as this block end this memory gets free up
//after this block it has no life
//because of this you can't create private,public because its life is also inside this method only.

//hoe you can invoke LocalInnerClass see in ObjectTest