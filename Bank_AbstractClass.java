package LearningJAVABasicsToAdvance;

public abstract class Bank_AbstractClass {

    public void greet() { //Concrete method
        System.out.println("Welcome");
    }

    public abstract float getRateOfInterest(); //Abstract Method


    class SBI extends Bank_AbstractClass { //  override
        @Override
        public float getRateOfInterest() {
            return 7.1f;
        }
    }

    class HDFC extends Bank_AbstractClass { //  override
        @Override
        public float getRateOfInterest() {
            return 7.5f;
        }
    }


    public void main(String[] args) {
         Bank_AbstractClass bk = new SBI();
        System.out.println(bk.getRateOfInterest());

    }
}