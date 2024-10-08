package LearningJAVABasicsToAdvance;

public class MemoryManagement {
    public static void main(String []args){
        int primitiveVariable1=10;
        Person personObj=new Person();
        String stringLiteral="24";
        MemoryManagement memObj=new MemoryManagement();
        memObj.memoryManagementTest(personObj);
    }

    private void memoryManagementTest(Person personObj){
        Person personObj2=personObj;
        String stringLiteral2="24";
        String stringLiteral3=new String("24");
    }
}

//they all creates memory in Heap and stack and when } is encountered then its reference gets deleted
//and after that object are left in heap then garbage collector comes in.
//System.gc(); //but it totally depends on JVM when to run. it do not gaurantee even if you write it then it gets deleted.
//periodically it checks and scan the heap if filling very fast then runs gc.
