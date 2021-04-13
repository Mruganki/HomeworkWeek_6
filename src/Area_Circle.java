
/*Created by : Mruganki
Topic :
Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
*/
import java.util.Scanner;//calling util package to run scanner class

public class Area_Circle {// class name is Area_circle

    public static void main(String[] args) {//main method
        double a1, r1;//variable
        Scanner input = new Scanner(System.in);// create an object anem input in scanner class
        System.out.println("Enter the radius of circle =");//print statment to enter value
        r1 = input.nextDouble();//method of scanner class
       // input.close();dont understand why this statement for? so i remove it but still result is showing same
        a1 = Math.PI * r1 * r1;//formula given
        System.out.println("Area of the circle is =" + a1);//printstatment to display result
    }


}



















































































































































