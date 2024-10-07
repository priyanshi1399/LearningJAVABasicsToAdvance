package LearningJAVABasicsToAdvance;

public class Method {


   /* public int sum(int var1,int var2) throws ArithmeticException{
        int total=var1+var2;
        int variable=25;
        Math.sqrt(variable); //its system defined Method   \
        //doing some logging stuff
        System.out.println("addition of var1 and var2 is: "+total);
        return total;
    }

    public int getPriceOfPen(){
        int capPrice=2;
        int penBodyPrice=5;
        int totalPenPrice=sum(capPrice,penBodyPrice);
        return totalPenPrice;
    }
    */

/*
    int stockPrice=20; //non-static
    static int carPrice=40; //static instance
//Understanding of Static Method ,in main I have to invoke it
    public static  int getPriceOfPen() {
        int capPrice = 2;
        int penBodyPrice = 5;
        return capPrice+penBodyPrice;
*/
        //carPrice=50;
      //*********can not access  stockPrice //
        //ans is which is associated with object which stock Price and static associated with class not object

        //in static you cannot access print method also it confuses which object
        //but if static then it will be able to call
        //print();

       /* Method mobj1=new Method();
        mobj1.print(); //here needs to tell which object can't directly call*/
  //

   //Concept of Static does it requires any instance it is just computing it does not change any state of object
   //it is not changing anything we can make static only it depends on argument
        /*static int carPrice = 40;
        public static int sum ( int a, int b) {
            int total = a + b;
            return total;
        }

        //this method depend upon the instance variable apart from argument
        public int sum2(int a,int b){
            int total=a+b;
            carPrice=carPrice+total;
            return carPrice;
        }*/
        //

    //Understanding VariableArgument

    /*public static int sum(int a,int b,int c,int d){
        int total=a+b;
        return total;
    }

    public static int sum(int a,int b){
        int total=a+b;
        return total;
    }
    public static int sum(int a,int b,int c){
        int total=a+b;
        return total;
    } */
   // So instead of creating so many overloaded method we will write like below

    public static int sum(int ...variable){ // possible (int a, int...variable) but not(int...varaible,int a)
        int output=0;
        for(int var : variable ){
            output=output+var;
        }
        return output;
    } //call in main method ,check in methodobj.sum(3,8,9,3,2,4,5,6);

    }
