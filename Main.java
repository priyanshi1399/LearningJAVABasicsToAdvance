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

        /*Generic class Issue*/

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
    }
}
