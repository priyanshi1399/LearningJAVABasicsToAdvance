package LearningJAVABasicsToAdvance;

import java.util.Objects;

class Laptop{
    String model;
    int price;

    @Override
    public String toString() {
        return "LearningJAVABasicsToAdvance.Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
/* public String toString(){
        return model+ ":"+ price;
    }

    public boolean equals(LearningJAVABasicsToAdvance.Laptop that){
       return this.model.equals(that.model) && this.price==that.price;
    }*/
}
public class Demo4 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model="LearningJAVABasicsToAdvance.Laptop Yoga1";
        obj1.price=1000;

        Laptop obj2 = new Laptop();
        obj2.model="LearningJAVABasicsToAdvance.Laptop Yoga";
        obj2.price=1000;
        boolean res=obj1.equals(obj2);
        System.out.println(obj2);
        System.out.println(res); //it compare by hexadecimal code
    }

}
