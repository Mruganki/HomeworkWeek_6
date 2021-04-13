import java .util.*;//

/*Created by:Mruganki

Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Add_Multi_Sub_Division {
    private static InstancetoMainmethod Calculatoral;
    public static void main(String[] args){// main method

        Scanner cal = new Scanner(System.in);//creating scanner
        System.out.println("Input first number:");//printstatement for input
        int a = cal.nextInt();//putting object to next function
        System.out.println("Input second number:");
        int b = cal.nextInt();//putting object to next function

        int add = a + b;//adding functionality of variable
        int subtract = a - b;// subtract functionality of variable
        int multiply = a * b;// multiplication functionality of variable
        int devide =  a / b;// division fuctionality of variable
        int mod =  (a % b + b) % b;

        System.out.println("Sum = " + add);// printstatmet of adding function
        System.out.println("Difference = " + subtract);// printstatment of subtract function
        System.out.println("Multiplication = " + multiply);//printstatment of multiplication function
        System.out.println("Division = " + devide);//printstatment of multiplication function
        System.out.println("MOD = " + mod);//printstatment of multiplication function
    }
    }














