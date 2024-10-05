package LearningJAVABasicsToAdvance;

public class Employee {

    int memberVariable;  //member Variable
    static int staticVariable=100; //static Variable


    Employee(){

    }
    //parameterized constructor
    Employee(int a){

    }
    //byte var; //class member variable
   /* public void dummyMethod() {
        // byte localvariable; //here need to initialize
        // System.out.println(localvariable);
        // System.out.println(var);
//    public static void main(String[] args){
//        int a=-10;
//        System.out.println("this is the value of a: "+a);
//


        byte localVariable = 100; //localVariable
        System.out.println(localVariable);
    }*/
    //Method Parameter
   /* public int dummyMethod2(int a,int b){
        return a+b;
    }*/


    //reference Data Type

    int empId;
    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId){
        this.empId=empId; //noe go to Student.java to see how empobj has reference
    }
}

