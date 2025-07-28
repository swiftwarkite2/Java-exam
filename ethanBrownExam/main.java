import java.util.Arrays;
import java.util.*;

// This is one of two java classes written as part of my final exam for intro to computer science lab class
public class main{
   
    public static void main(String[] args){                 // public means can be accessed by other objects. 
                                                            // static means this method is a class method rather than an object method.
                                                            // void means that the method doesent return a value.
    int a = 0;
    int b = 1;
    double c=a+b;
    double firstDouble = 12.5;
    double secondDouble= 235.9;
    System.out.println("The average of the two numbers is: "+c/2); // fulfills question 1 on the final
    if(firstDouble>secondDouble){
        double biggerDouble = firstDouble;
        System.out.println("The first double is bigger!");
    }
    else if(firstDouble<secondDouble){
        double biggerDouble = secondDouble;
        System.out.println("The second double is bigger!"); // fulfills question 2 on the final
    }
    int[] allZeros = new int[10];                           // creats an int array of 10 values
    for(int i=0;i<10;i++){                                  // loops throught all 10 values in the array
        allZeros[i]=0;                                      // sets the value to 0 every time
        if(i==0||i==9){                                     // prints 1 and 9 when the loop reaches that place
            System.out.println(i);
        }
        if(i>2&&i<6){
            System.out.println("Are we there yet?");        // prints are we there yet when the loop is on 3,4,5
        }
    }
    for(int i=3;i<11;i++){                                  //from 3 to 10 print a line with the the number of the number on of that number. 333 or 55555 example
        for(int y=0;y<i;y++){
            System.out.print(i);
        }
        System.out.println();
    }
    Robot object = new Robot();                             // these lines call upon the robot class and creates objects from that class with specific variables
    System.out.println(object.getName());                   // the default name is cheap robot from amazon so this line will print that name
    object.setName("HK47");
    System.out.println(object.getName());                   // the robot name has been changed to hk47 so this line will pront that name
    object.upgradeRobot();
    System.out.println(object.getName());                   // the robot has been upgraded and its name is now upgraded robot so this line will print that name
    Robot[] army = new Robot[100];                          // creates 100 robots
    for(int i=0;i<100;i++){
        Robot soldier = new Robot();                        // upgrades each robot
        soldier.upgradeRobot();
        army[i]=soldier;
    }
    for(int i=0;i<100;i++){
        System.out.println(army[i].getName());              // prints 100 lines of upgraded robot
        
    }
    // i would want 100 cloning robots, who could clone organs or
    // even whole body parts for people so that they could have a 
    // perfect match and not have to wait for the right doner
    // human cloning will be a massive improvement to medical capabilities
    // and with robots doing it, the cloning could be cheap and fast
    }
}
