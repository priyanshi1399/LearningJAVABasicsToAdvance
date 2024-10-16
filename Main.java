package LearningJAVABasicsToAdvance;

public class Main {
    public static void main(String[] args){
        //ConstructorOverload cs=new ConstructorOverload("priyanshi"); //So this calles the first one

       // ConstructorOverload cs=new ConstructorOverload("priyanshi",3);

      //  PrivateConstructor pc=new PrivateConstructor();

        PrivateConstructor pc=PrivateConstructor.getInstance();
        Managaer_CC obj=new Managaer_CC(10,10); //new says we have to call the constructor
        //first it will go and initialize parent constructor

        //example 2-->we have to give all the argument to initialize

        /*Generic class Issue

        GenericClass_1 genClassObj=new GenericClass_1();
        genClassObj.setPrintValue(1); //its integer
        Object printValue= genClassObj.getPrintValue()  ; //object is parent of all
        //we can not use printValue directly, we have to typecast it,else it will be compile time error
        //this is the main issue in these type of classes here generic class comes into picture
        //to avoid this typecasting //see in Generic Class
        if((int)printValue==1){
            //do something
            System.out.println("checking generic........");
        }
        */

        /*Generic class (how we tell at compile time)

      //  Generic Type (in example <T>) can be replaced with any non-primitive type object

        //here at compile time only we told it is of Integer Type so it will automatically take integer.
        //if you try to pass any other it will cause compile time error.
        Print_GenericClass<Integer> printObj1=new Print_GenericClass<Integer>();
        printObj1.setPrintValue(1);
        Integer printValue=printObj1.getPrintValue();
        if(printValue==1){
            System.out.println("Generic Class Example..");
        }

*/
        /* Inheritence in Generic Class example
        ColorPrint_GenericInheritence colorPrintObj=new ColorPrint_GenericInheritence();
        colorPrintObj.setPrintValue("2");
        String printValue=colorPrintObj.getPrintValue();
        if (printValue.equals("2")){
            System.out.println("checking Inheritence generic");
        }
        //creating object of colorprint and storing string value
        */


        /* Generic Sub Class

        //here we will define the object type,here do it for string,create string type

        GenericSubClass<String> genericSubObj=new GenericSubClass<>();
        genericSubObj.setPrintValue("2");

*/

/* More than one Generic Class*/
        Generic_MoreThanOne<String,Integer> geneMoreObj=new Generic_MoreThanOne<>();
       // Generic_MoreThanOne<String,Integer> geneMoreObj=new Generic_MoreThanOne<String,Integer>(); //both are correct
        geneMoreObj.put("hello",1243);

       /* Print_GenericClass<Integer> printObj=new Print_GenericClass<Integer>();
        printObj.value=10;
        (String)(printObj.value);*/





    }
}
