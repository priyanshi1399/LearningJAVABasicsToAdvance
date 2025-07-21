package LearningJAVABasicsToAdvance;

import java.util.Objects;

public class Laptop_ObjectDemo {
    String model;
    int price;

//    @Override
//    public String toString(){
//        return "Laptop [model="+model +",price="  +price + "]";
//    }

    public boolean equals(Object obj){
        Laptop_ObjectDemo Other= (Laptop_ObjectDemo) obj;
        return Objects.equals(this.model,Other.model) && price==Other.price;
    }

    public int hashCode(){
        return 2; //customizing the hashCode Value
    }

    public static void main(String[] args){
        Laptop_ObjectDemo obj=new Laptop_ObjectDemo();
        obj.model="Dell 123";
        obj.price=20000;



        Laptop_ObjectDemo obj1=new Laptop_ObjectDemo();
        obj1.model="Dell 123";
        obj.price=20000;
        System.out.println(obj.toString());
        //o/p-LearningJAVABasicsToAdvance.Laptop_ObjectDemo@65ab7765 (hash code value)
        System.out.println(obj.equals(obj1)); //we have to override it
    }
}
