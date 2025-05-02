package LearningJAVABasicsToAdvance;

import java.util.Random;

/*class Z implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}*/
/*class V implements  Runnable{
    public void run(){
        for(int i=0;i<=5;i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}*/

public class Example_Runnable {
    public static  void main(String [] args){
        Runnable obj1=()->{

                for(int i=0;i<=5;i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

        };
        Runnable obj2=()->{

                for(int i=0;i<=5;i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
       // obj1.start();
        //obj2.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
    }
}
