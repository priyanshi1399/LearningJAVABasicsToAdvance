package LearningJAVABasicsToAdvance;


class C{

   public void showThedatawhichBelongsToThisClass(){
        System.out.println("In C show");
    }
}
class D extends C{
    @Override
    public void showThedatawhichBelongsToThisClass() {
        System.out.println("In D Class");
    }


}
public class Demo_Annotation {
    public static void main(String[] args) {
        D obj = new D();
        obj.showThedatawhichBelongsToThisClass();

    }
}
