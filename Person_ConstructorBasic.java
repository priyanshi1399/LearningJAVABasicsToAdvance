package LearningJAVABasicsToAdvance;

public class Person_ConstructorBasic {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //check in main
    /*Person Constructor*/


    public Person_ConstructorBasic() { //default constructor
        System.out.println("Person Object is created");

        this.name="Sachin";
        this.age=-99;
    }

    public Person_ConstructorBasic(String name,int age){//paramterized constructor
        this.name=name;
        this.age=age;
    }


    public static void main(String[] args) {

        Person_ConstructorBasic person1 = new Person_ConstructorBasic();
        System.out.println(person1.getName());
        Person_ConstructorBasic person2=new Person_ConstructorBasic("Ajay",56);
        //Ajay and 56 are stored into local then it get copied to instance variable
        //if we arite name=name then there will be confusion Ajauy will be copied to same name variable
        //this.name=name; //this corresponds to object name will be object and right side one is localvariable
        //JVM will copy from local to instance

        person1.setAge(25);
        person1.setName("RAM");
        System.out.println(person2.getAge());
        System.out.println(person1.getName());

        //earrlier--when this.name not set the name=null,age=0;
        Person_ConstructorBasic person3=new Person_ConstructorBasic();
        Person_ConstructorBasic person4=new Person_ConstructorBasic();
        System.out.println(person3.getName() +" "+ person3.getAge());
        System.out.println(person4.getName() +" "+ person4.getAge()); //same value in person4 also because previously value assign those only

    }
}