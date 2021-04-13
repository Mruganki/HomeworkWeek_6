import java.util.Scanner;// import util to support scanner

public class Calculator { // class name is calculator

        public static void main(String args[])// main method
        {
            int M1, M2, add, subtract, multiply;// variables
            float devide;// deta type define
            Scanner scanner = new Scanner(System.in);// new object created for scanner class

            System.out.print("Enter Two Numbers : ");// printstatment to get new value for calculator
            M1 = scanner.nextInt();// method of a scanner class
            M2 = scanner.nextInt();// method of a scanner class

            add = M1 + M2;//adding functionality of variable
            subtract = M1 - M2;// subtract functionality of variable
            multiply = M1 * M2;// multiplication functionality of variable
            devide = (float) M1 / M2;// division fuctionality of variable

            System.out.println("Sum = " + add);// printstatmet of adding function
            System.out.println("Difference = " + subtract);// printstatment of subtract function
            System.out.println("Multiplication = " + multiply);//printstatment of multiplication function
            System.out.println("Division = " + devide);//printstatment of multiplication function
        }
    }












