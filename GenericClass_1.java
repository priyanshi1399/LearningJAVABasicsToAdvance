package LearningJAVABasicsToAdvance;

public class GenericClass_1 {

    Object value;


    public Object getPrintValue(){
        return value;
    }
    public void setPrintValue(Object value){
        this.value=value;
    }

    //as we know object is the Parent of all , here in this example passing a Object Value, so it can take or accepts any value
    //check in Main Class what happens and what issue can occur by this
}
