public class InstanceandstatictoMainmethod {

    /*Created by: Mruganki
    3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
     */


    float h = 3.009f;// Declare instance variable
    static String name = "hello";// Declare static variable

    void l1(){
        //Declare instance method
        System.out.println(h);// calling instance variable in instance method
        System.out.println(name);//calling static variable in instance method
    }
    static void l2() {

        //Declare static method
        InstanceandstatictoMainmethod D2 = new InstanceandstatictoMainmethod ();
        System.out.println(D2.h);//calling instance variable in static method
        System.out.println(name);// calling static variable in static method
        D2.l1();//calling Instance method in static method

    }
    public static void main(String[] args){
        InstanceandstatictoMainmethod D1 = new InstanceandstatictoMainmethod ();
        System.out.println(D1.h);//calling instance variable in static method
        System.out.println(name);//calling static variable in main method
        D1.l1();// calling instance method in main method
        l2();// calling static method in main method




    }













}
