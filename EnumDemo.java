package LearningJAVABasicsToAdvance;

public class EnumDemo {
    enum Direction{
        EAST,WEST,NORTH,SOUTH
    }


    public static void main(String [] args){
        Direction d=Direction.NORTH;
        int x=10; //line 10 &11 is same

       // Direction d=Direction.North; //error, bcz it will consider only 4 valid values

        //Switch Statement
        int noOfCities=8;

        switch(d){
            case EAST:noOfCities=8;
                break;
            case WEST: noOfCities=5;
                break;
            case NORTH:noOfCities=7;
                break;
            case SOUTH:noOfCities=9;
               break;
        };
        System.out.println("No of cities: ="+noOfCities);

        //Switch Expression
        noOfCities=
                switch(d){
                    case EAST:noOfCities=8;
                        yield 8;
                    case WEST: noOfCities=5;
                        yield  5;
                    case NORTH:noOfCities=7;
                       yield 7;
                    case SOUTH:noOfCities=9;
                       yield  9;
                }; //semicolon at the end needed and no break just yield statement
        System.out.println("No of cities: ="+noOfCities);

        //Method of Enum:
        Direction array[]=Direction.values(); //4 values will be stored in array
        for(Direction d1: array){ //iterating in enhanced for loop
            System.out.println(d1.name() + " "+ d1.ordinal()); //ordinal will give index of every value
        }
    }
}
