
import java.util.Scanner;
public class TwoBinary_Addition {
/*
Create a java programe to add two binary number display should be 101
input first number: 10
input second number :  11
binary result : 101
 */
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);//create object for scanner
            System.out.println("Input first binary Number: ");//ask the user to add value
            String a = in.nextLine(); //10

            System.out.println("Input second binary Number: ");//ask the user to add value
            String b = in.nextLine();//11

            Integer no1 = Integer.parseInt(a, 2);//function for intergerclass is parseint to convert decimal to binary
            System.out.println("Decimal no1: " + no1);//printstatment to display decimal
            Integer no2 = Integer.parseInt(b, 2);//function for interclass is parseint to convert decimal to binary
            System.out.println("Decimal no2: " + no2);//printsatment to display decimal


            Integer res = no1 + no2;// result statement for integer class
            System.out.println("Decimal result:" + res);//printstatment for result
            System.out.println("Binary result: " + Integer.toBinaryString(res));//printstatment for binaryresult
        }

        }