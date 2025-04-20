package LearningJAVABasicsToAdvance;

class Human3{
    private int age;
    private String name;
    public Human3(){
        age=10;
        name="John";
        //System.out.println("in constructor");
    }

    public Human3(int a, String n){
        age=a;
        name=n;
        //System.out.println("in constructor");
    }

    public Human3(String n){
        //age=12;
        name=n;
        //System.out.println("in constructor");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Demo_C {
    public static void main(String[] args) {
        Human3 obj = new Human3();
        Human3 obj1 = new Human3(11,"Priyanshi");
        Human3 obj2 = new Human3("Priyanshi");
        System.out.println(obj.getAge() +":" +obj.getName());
        System.out.println(obj1.getAge() +":" +obj1.getName());
        System.out.println(obj2.getAge() +":" +obj2.getName());
        //obj.setAge(11);
    }
}
