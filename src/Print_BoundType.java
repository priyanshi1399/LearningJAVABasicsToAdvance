//This is an example of generic UpperBound/typeBound
public class Print_BoundType <T extends Number>{ //you can pass Number and below it
 //you can pass me NUmber or below it ,Integer, ..
 //if you will pass string it will give error
 //We have restricted the value of passing parameter
    T value;

    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value=value;
    }
}
//See in main how object creation happens