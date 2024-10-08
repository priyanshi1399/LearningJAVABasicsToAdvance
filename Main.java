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
    }
}
