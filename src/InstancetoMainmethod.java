public class InstancetoMainmethod {
    /*
    Created by: mruganki
    Topic : Intance variable to main
     */
    double a  = 10.8;// instatnce variable
    long b= 8000; // instatnce variable
    void add(){ // instance method
     System.out.println(a);// printstatment to print instance varible
     System.out.println(b);// printstatment to print instance variable; but jvm read from main method only..
    }
    //Main method
    public static void main(String[] args){
        InstancetoMainmethod c1 = new InstancetoMainmethod();//create an object for instance variable to printinstance in mainmethod
       System.out.println(c1.a);//printstatment to print instance varible
       System.out.println(c1.b);//printstatme to print instance variable
       c1.add();// printstatment to print instatce method










    }





}
