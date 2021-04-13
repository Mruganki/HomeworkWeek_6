/*Created by: Mruganki
topic
temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

    import java.util.Scanner;// calling util package for scanner class
    public class Temprature_Cal {

        public static void main(String[] Strings) {//main statement
             double fahrenheit,celsius;// define variable

            Scanner input = new Scanner(System.in);// creating object in scanner class

            System.out.print("Input a degree in Fahrenheit: ");// printstatement
             fahrenheit = input.nextDouble();// define object in next function syntax

              celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);// formula given
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");// printstament
        }
}
