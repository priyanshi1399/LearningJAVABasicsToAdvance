package LearningJAVABasicsToAdvance;
interface Computer{
    public abstract void code();
}
class Laptop1 implements Computer {

    public void code(){
        System.out.println("code..compile..run");
    }
}
class Desktop implements   Computer{
    public void code(){
        System.out.println("code..compile..run: Faster");
    }
}
class Developer{

    public void devApp(Computer lap){
        lap.code();
    }
}
public class Demo_Interf {
    public static  void main(String [] args){
        Computer lap=new Laptop1();
        Computer desk=new Desktop();
        Developer priyanshi=new Developer();
        priyanshi.devApp(lap);
    }
}
