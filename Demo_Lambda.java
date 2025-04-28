package LearningJAVABasicsToAdvance;

import org.w3c.dom.ls.LSOutput;
@FunctionalInterface
interface A13{

    int add(int i,int j);

}
public class Demo_Lambda {
    public static void main(String[] args) {
        A13 obj =(i,j)-> i+j;
       /* A13 obj = new A13() {
            public int add(int i, int j){
                return i+j;
            }
        };
        */


        int result = obj.add(5, 4);
        System.out.println(result);
    }
}
