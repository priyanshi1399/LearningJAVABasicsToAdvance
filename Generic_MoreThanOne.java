package LearningJAVABasicsToAdvance;
//Example of More than one Generic Type Example
//className<T>
//Classname<T1,T2,T3..>
public class Generic_MoreThanOne <K,V>{ //taking key value

    private K key;
    private V value;

    public void put(K key, V value){
        this.key=key;
        this.value=value; //Simply Objective is to show that It can take more than 2 values
        //Now observe in main its object creation
    }
}
