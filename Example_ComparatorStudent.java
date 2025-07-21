package LearningJAVABasicsToAdvance;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Students  {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }



    public int compareTo(Students that) {
        if(this.age>that.age){
            return 1;
        }
        return -1;
    }
}
public class Example_ComparatorStudent {
    public static  void main(String [] args){
        /*Comparator<Students> com=new Comparator<Students>() {
            @Override
            public int compare(Students i, Students j) {
                if(i.age>j.age){
                    return 1;
                }
                return -1;
            }
        };*/

        //converting it to lambda
        Comparator<Students> com=( i,  j)->  i.age>j.age?1:-1;
                /*if(i.age>j.age){
                    return 1;
                }
                return -1;*/


        List<Students> studs=new ArrayList<>();
        studs.add(new Students(21,"Priyanshi"));
        studs.add(new Students(34,"Saniya"));
        studs.add(new Students(32,"Madhu"));
        studs.add(new Students(42,"Astha"));
        studs.add(new Students(19,"Aaradhya"));
        studs.add(new Students(17,"Ayushi"));
        Collections.sort(studs,com);
            for(Students s: studs){
                System.out.println(s);
            }
    }
}
