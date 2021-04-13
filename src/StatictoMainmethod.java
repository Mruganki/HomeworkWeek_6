public class StatictoMainmethod {
    /* Created by : Mruganki
    Topic: Static variable and static method to main method calling by creating object
     */
/*
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */
    static int x = 44;// creating static variable1
    static float y = 9.099f;// creating static variable2
    //Static method
    static void k2(){
        System.out.println(x);// static variable in static method
         System.out.println(y);//static variable in static method
    };
 public static void main(String[] args){//declare main method
     k2();// calling static method in main method
     System.out.println(x);// calling static variable in main method
     System.out.println(y);// calling static variable in main method
 }





}
