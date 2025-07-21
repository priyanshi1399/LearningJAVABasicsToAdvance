package LearningJAVABasicsToAdvance;

//in <> put any letter in caps , at compile time we can tell this class can be replaced with integer,string etc
//wherever I was using Object write <T>
public class Print_GenericClass<T> {

    T value;

    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value=value;
    }
    //Now observe difference in main , how while creating we tell the object typel

}
