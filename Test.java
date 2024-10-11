package LearningJAVABasicsToAdvance;

public class Test {
    public static void main(String[] args) {
        Car audiCarObj = new Car() {
            @Override
            public void pressBreak() {
                //my audi implements here
                System.out.println("Audi specific break Changes");
            }
        };

        audiCarObj.pressBreak();
    }
}
//2 things happened behind the scene
//a subclass is created and name is define by compiler
//creates an object of subClass and assign its reference to object "audiCarObj"

//when compiler compiles this Test Class  then it creates a file