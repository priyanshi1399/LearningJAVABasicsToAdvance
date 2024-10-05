package LearningJAVABasicsToAdvance;

public class Student {
    public static void main(String[] args) {
       /* Employee obj = new Employee();
        obj.dummyMethod();*/

      /*  float var1=.3f;
        float var2=.1f;
        float var3=var1-var2;
        System.out.println(var3);
        */
        //Automatic conversion
       /* byte x=10;
        int intVariable=x;

        System.out.println(intVariable); //due to automatic conversion
*/

        //Downcasting
       /* int intVariable2 = 128;

        //range of byte =-128 to 127  //it will go to +1 it will print after 127 goes to -128 to +1->-128
        byte byteVariable = (byte) intVariable2;
        System.out.println(byteVariable); */


        //byte range is -128 to 127
       /* byte a = 127;
        byte b = 1;
        int sum = (byte)(a + b);  //here it is promoted and explicit you have to do byte and print -128
        //if you take integer and remove byte it will print 128
        //it do internal promotion so here all byte short converted to integer or tke it to integer
        System.out.println(sum);*/


      /*  int a=34;
        double  doubleVar=20d;
        int sum=(int)(a+doubleVar); //if one of data type is higher then it will be converted to that only
        System.out.println(sum);*/

       /* Employee obj1=new Employee();
        Employee obj2=new Employee();

        System.out.println(Employee.staticVariable);

        //no matter how many object you created it has one value and access by classname
        System.out.println(obj1.memberVariable+obj2.memberVariable);

        obj1.dummyMethod2(2,5);*/

        //in constructor also you can pass the variable


        //Reference Data Type

        Employee empobj=new Employee();
        //empobj is a reference .. holds reference to the actual memory
        empobj.empId=10;
        modify(empobj);
        System.out.println("The value is: "+empobj);


    }
    //here employee object which is of class type also points to the same memory,
    // holds a reference to this now value set to 20
    private static void modify(Employee employee){
        employee.empId=20;
    }


}
