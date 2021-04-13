import java . util.*;// call util package for scanner class
public class Average {
    /*Java program that takes three numbers as input to calculate and
    print the average of the numbers.
*/
    public static void main(String[] args) {//main method
        Scanner avg = new Scanner(System.in);//object created
        System.out.println("Enter the number to calculate average");//print statement to enter data
        double a = avg.nextDouble();//datatype declared
        double b = avg.nextDouble();//datatype declared
        double c = avg.nextDouble();//datatype declared
        double average = (a+b+c)/ 3;// formula for average

        System.out.println("Average of the input is : " + average);//print statement to display result


    }


}
