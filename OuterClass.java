package LearningJAVABasicsToAdvance;
//This is example of Nested Static class
 class OuterClass {//by default package private not given public
//this outerclass can not be private,protected or other.it csn be public or package private
     int instanceVariable=10;
     static int classVariable=20;

     static class NestedClass{ //Nested classes can be taken private,protected,public or even the package private
         public  void print(){
          //  System.out.println(classVariable + instanceVariable); //herenot able to access instanceVariable because this is related to obj
             //static class can access static variable and static method
             //able to access class variable
             System.out.println(classVariable);
         }
     }
}
//static Nested Class
//inside an outer class ,can create a nested class that is static class inside that you can access static data static member and static method.
// .//how to invoke this method print???..check in ObjectTest2 class