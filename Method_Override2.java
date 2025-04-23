package LearningJAVABasicsToAdvance;


    class Calculator{

        public int add(int n1,int n2){
            return n1+n2;
        }
    }

    class AdvanceCalculator extends Calculator{

        public int add(int n1,int n2){
            return n1+n2+1;
        }
    }
public class Method_Override2 {
        public static void main(String [] args){
        AdvanceCalculator obj=new AdvanceCalculator();
        int r1=obj.add(5,2);
            System.out.println(r1);
        }
}
