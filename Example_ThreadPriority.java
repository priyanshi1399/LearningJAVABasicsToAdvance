package LearningJAVABasicsToAdvance;

class First extends Thread{

    public void run(){
        for(int i=1;i<100;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Second extends  Thread{

    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Example_ThreadPriority {

    public static void main(String[] args) {
        First obj1 = new First();
        Second obj2 = new Second();

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}
