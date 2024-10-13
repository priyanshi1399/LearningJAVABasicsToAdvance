public class RawType_Print<T> { //class level defined type parameter
    //this is example of Raw Type Generics
    T value;
    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value=value; // now observe in Main
    }
}
