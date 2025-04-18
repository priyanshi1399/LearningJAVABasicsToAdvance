package LearningJAVABasicsToAdvance;

class Human1{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age, Human1 obj) {
        Human1 obj1=obj;
        obj1.age = age; //now we are not creating new object
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Human1 obj = new Human1();
        obj.setAge(10,obj);
        obj.setName("Priyanshi");
        System.out.println(obj.getAge() +":"+ obj.getName());
    }
}



