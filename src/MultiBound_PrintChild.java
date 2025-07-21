public class MultiBound_PrintChild <T extends ParentClass & Interface1 & Interface2> {
    //this is the child class to it
    T value;

    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value=value;
    }
}

//here concept is that in its Parent Class it is extending the same concrete class and 2 interfaces
//if you change it to one Interface then it will not accept.
// See and observe the main class for Multi Bound
//if it implements interface 1 not interface 2then gives error
//it should be parent class and below it but Interface 1 and Interface2