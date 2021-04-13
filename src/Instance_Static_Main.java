public class Instance_Static_Main {
    /*Created by:  Mruganki
    Topic:      Java programme- instance static & main method

    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.
     */
    double h = 5.5;// intance variable
    int t = 80;// instance variable
     static double d = 4.6;// static variable
     static int p = 90;// static variable

     void  r1(){ //  instance method

         System.out.println(h);//calling instance variable into instance method
         System.out.println(t);//calling instance variable into instance method
         System.out.println(p);//calling static variable into instance method
         System.out.println(d);//calling static variable into instance method
     };

     static void r2() {  // static method
         Instance_Static_Main tog = new  Instance_Static_Main();
         System.out.println(tog.h);//calling instance variable into static method
         System.out.println(tog.t);//calling instance variable into static method
         System.out.println(p);//calling static variable into static method
         System.out.println(d);//calling static variable into static method
     }
     public static void main(String[] args){ // main method

         Instance_Static_Main mog = new  Instance_Static_Main();//create object to call instance method in main
         r2();// calling static method in main method
         mog.r1();// calling instance method in main method with object reference
     }
}
