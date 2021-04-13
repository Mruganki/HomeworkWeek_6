
import java.util.*;

public class Area_Triangle {

    // Created by : Mruganki
//Java programme  to calculate area of Triangle
    public static void main(String[] args) {//main method
        Scanner Tri = new Scanner(System.in);//object created
        System.out.println("Enter the number to measure area of Triangle");//print statement to enter data
        float radius = Tri.nextFloat();//datatype declared
        float height = Tri.nextFloat();//datatype declared
        float area = (radius * height) / 2;// formula for area of triangle

        System.out.println("Area of Triangle is: " + area);//print statement to display result
    }


}