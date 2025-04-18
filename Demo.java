package LearningJAVABasicsToAdvance;

class Human{
     private int age;
     private String name;

     public int getAge(){
         return age; //we can access the
     }

     public String getName(){
         return name;
     }

     public void setAge(int a){
         age=a;
     }
     public void setName(String n){
         name=n;
     }
}
public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        //obj.getAge(11);
        //obj.getName("Priyanshi");
        //System.out.println(obj.getAge() + ":" +obj.getName());
        obj.setAge(11);
        obj.setName("Priyanshi");
        System.out.println(obj.getAge() + ":" +obj.getName());
    }
}
