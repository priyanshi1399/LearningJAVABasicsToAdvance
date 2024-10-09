package LearningJAVABasicsToAdvance;

public class Audi extends LuxuryCar{

    Audi(int mileage){
        super(mileage);
    }
    public void pressClutch(){
        //its implementation
    }

    @Override
    public void pressDualBreakSystem(){
        //its implementation
    }
}

//for Audi you can create object but yes you can store reference in parent class.

/*LuxuryCar lx=new Audi();
this is correct.*/