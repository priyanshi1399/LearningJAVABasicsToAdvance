package LearningJAVABasicsToAdvance;

public class VariablesDemo {
    int x; //Instance Variable
    static int y; //Static Variable


    void display(){
        int z=10; //local variable
        System.out.println(z);
    }
    public static void main(String[] args){
        VariablesDemo ob1=new VariablesDemo(); //ob--referece variable
        VariablesDemo ob2=new VariablesDemo();
        VariablesDemo ob3=new VariablesDemo();

        var x=2.4; //internally considered as 2.4
        for(var i=0;i<5;i++){
            System.out.println("Welcome"+ " ");
        }
    }

}
