package LearningJAVABasicsToAdvance;

public class VariableArgumentDemo
{
    /*public void displayAll(int a){
        System.out.println(a);
    }
    public void displayAll(int a,int b){
        System.out.println(a);
    }
    public void displayAll(int a,int b,int c){ //instead of creating many function
        System.out.println(a);
    }
    */
    //So instead of writing so many function adding variable VariableArgument comesinto picture
    //VarArgs

    public void displayAll(int ...a){
     //internally a will be created as dynamic array here array size is not fix it can increase or decrease accoordinbg to run time
     for(int i=0;i<a.length;i++){
         System.out.print(a[i]+ " ");
     }
     for(int val:a){
         System.out.println(val+ " ");
     }
    }


    public static void main(String[] args){
        VariableArgumentDemo obj=new VariableArgumentDemo();
        obj.displayAll(10,20,30,40);
    }
}
