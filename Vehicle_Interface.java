package LearningJAVABasicsToAdvance;

public interface Vehicle_Interface {
    void showMileage();
    void getNoOfGears();

    default void showAC(){

    }; //write like that //changing the implemtation

    class FourWheeler implements Vehicle_Interface{
    @Override
    public void showMileage(){
        System.out.println("70");
    }

    public  void getNoOfGears(){
        System.out.println("60");
    }

    @Override
        public void showAC(){
        System.out.println("AC is implemented");
    }

    }

    class TwoWheeler implements  Vehicle_Interface{
        @Override
        public void showMileage(){
            System.out.println("80");
        }

        @Override
        public  void getNoOfGears(){
            System.out.println("40");
        }



    }

    public static void main(String [] args){
        Vehicle_Interface v=new FourWheeler();
        v.showMileage();
        v.getNoOfGears();
    }
}
