package LearningJAVABasicsToAdvance;

public abstract class LuxuryCar extends AbstractClassesExample{

    LuxuryCar(int mileage){
        super(mileage);
    }

    public abstract void pressDualBreakSystem(); //either it can provide more abstraction
    //or provide implemntation. added one more abstract method and implementation of pressBreak.
    //this class is also abstract//noe create one more Child Audi.

    @Override
    public void pressBreak(){
        //implememtation of it goes here
    }

}

//here you can not make new LuxuryCar Object.
