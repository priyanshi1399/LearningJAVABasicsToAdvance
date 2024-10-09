package LearningJAVABasicsToAdvance;

public abstract class AbstractClassesExample {
    int mileage;
    AbstractClassesExample(int mileage){
        this.mileage=mileage;
    }
    public abstract void pressBreak();

    public abstract void pressClutch();

    public int getNumberOfWheels(){
        return 4;
    }
    //this has abstract method and implemented non-abstract method. for abstract method no implementation.
    //Now see LuxuryCar which is extended class of it.

}
