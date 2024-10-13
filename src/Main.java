import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*Example of generics method
        Print printObj=new Print();
        printObj.setValue(new Bus()); //It can accept anything Bus Type,Car Type
  */


  /* Example of Raw Type Generics

        RawType_Print<String> parameterizedTypeprintObject=new RawType_Print<>();
        //Internally it passes Object as parameterized type.
        RawType_Print rawTypePrintObject=new RawType_Print(); //Raw Type I am creating object Type as usual
        //This is known as RawType Object, Internally compiler will pass
      //  RawType_Print<Object> rawType=new rawtype_Print<Object>();
        rawTypePrintObject.setPrintValue(1);
        rawTypePrintObject.setPrintValue("hello");

        */

//Type Parameter should be before the return Type of the method declaration.
//Type Parameter scope is limited to method only. Its not like the class

        /* Bound Type Generics
        Print_BoundType<Integer> parameterizedTypePrintObject=new Print_BoundType<Integer>();//This is ok because Integer Class is under Number
      //  Print_BoundType<String> parameterizedTypePrintObject=new Print_BoundType<String>();//but this is wrong because, String is not a child of Number

*/

    /* <Multi Bound Generics
        MultiBound_parentClass obj=new MultiBound_parentClass();
        MultiBound_PrintChild<MultiBound_parentClass> printChildObj= new MultiBound_PrintChild<>();
        */

        /* Understanding Concept of WildCard Generics*/
        List<Vehicle> vehicleList= new ArrayList<>();
        vehicleList.add(new Bus());
        vehicleList.add(new Car());
        List<Bus> busList=new ArrayList<>();
        Print_WildCard printObj=new Print_WildCard();
        printObj.setPrintValues(vehicleList); //It is accepeting because it is expected in class
        //now If I want to pass same method busList can I pass No because busList is not type of vehicleList

        /*
        //printObj.setprintValues(busList);
       // So, how to overcome it with the help of Wildcard-lower bound,upperbound,unbound
        //..after changing in its WildCard_Print class give busList able to access
        //printObj.setPrintValues(busList); //concept of upperBound
        */


        /* LowerBound Example

        //printObj.setPrintValues(busList); //you will not be able to access busList because this is child class
        //but vehicle we can access
        //now who is the parent of vehicle--->object that is acceptable

        List<Object> objList=new ArrayList<>() ;//that is acceptable

        */

        /*
        //vehicleList=busList; //this is not valid, it can create object of bus busList
        // intenstion is to create object of bus but this is object /objects are different
        //busList=vehicleList //this is not valid, trying to store in busList, so not valid
        Vehicle vehicleObj=new Vehicle();
        Bus busObj=new Bus();

        vehicleObj=busObj; //ok
        */

    }
}

