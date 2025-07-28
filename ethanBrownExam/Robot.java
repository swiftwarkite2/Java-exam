//Ethan Brown
// This is a class called by main that can create and modify robot objects
public class Robot
{
   private String name;
   private int wheels;
   private double topSpeed;
   public Robot(){
       name= "Cheap Robot from Amazon.com"; // default name number of wheels and top speed of the robot object
       wheels = 4;
       topSpeed = 3.5;
   }
   public String getName(){
       return this.name;                    // allows caller to read the robots name
   }
   public void setName(String name){
       this.name= name;                     // allows caller to give the robot a specific name
   }
   private void addWheel(){
       wheels=wheels+1;                     // this method adds 1 to the number of wheels the robot has
   }
   private void faster(Double speed){
       topSpeed=topSpeed*speed;             // this method multiplies the current speed value by the inputted number
   }
   public void upgradeRobot(){
       addWheel();                          // this calls the addWheel method
       faster(10.0);                        // this calls the faster method with the input 10.0
       setName("Upgraded Robot");           // a command to update all the robots characteristics including changing the robots name
   }
}
