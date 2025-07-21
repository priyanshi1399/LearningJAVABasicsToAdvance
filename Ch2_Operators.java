package LearningJAVABasicsToAdvance;

public class Ch2_Operators {
    public static void main(String[] args){
      /*  int a=4;
        int b=6*a;
        System.out.println(b); */

        //assignment opearors
        //Comparison Operators
        //Logical Operators
        //Bitwise operators
        //4.8%1.1-->returns decimal


        //operator Precedence

      /*  int a=6*5-34/2;

        /*
        30-17
        =13
         */

        //  int b=60/5-34*2; //here * and / have same precedence now comes to associativity
        /*

        highest precedence goes to * and /. They are evaluated based on associativity.
            here left to right

            12-68
            -56
         */

        // System.out.println(a);
        //  System.out.println(b); */
        //Precedence and Associativity
        // * will evaluated first

        //Quick Quiz

        // int x=5;
        // int y=1;

        //  int k=x*y/2;
     /*   int a=5;
        int b=1;
        int c=4;
        int k=b*b-(4*a*b*c)/(2*a); //more precedence parenthesis
        System.out.println(k); */

        //Increment operator
       /* int i=56;
        int b=i++; //first b is assigned i (56) then i is incremented
        int j=67;
        int c=++j; //first j is incremented then c is assigned j(68)
        System.out.println(i++); //first use then increment
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i); */


        int y=7;
        int x=++y+8;
        //int x=y+++8;
        System.out.println(x);
        char ch='a';
        System.out.println(ch++);
        System.out.println(ch);
    }
}
