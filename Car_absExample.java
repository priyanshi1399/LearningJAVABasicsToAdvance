package LearningJAVABasicsToAdvance;


abstract class Carr{

    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("play Music");
    }
}

abstract class WagonR extends Carr{


}
class Nano extends WagonR{

    public void drive(){
        System.out.println("driving");
    }
    public void fly(){
        System.out.println("flying");
    }
}


public class Car_absExample {

    public static  void main(String [] args){
        Carr obj=new Nano();
        obj.fly();
        obj.drive();
        obj.playMusic();

    }
}
