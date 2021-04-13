
import java.util.*;// calling java util package for scanner class
// create programe
//Decimal to Binary
/*
Input number = 5

Binary nuber is =101
 */
public class DecimaltoBinary {

    public static void main(String[] args) {// main method
        Scanner sc=new Scanner(System.in);// creating object in scanner
        System.out.println("Enter a decimal number");// printstatment to display entering text
        int n=sc.nextInt();// define object in next token
        int  bin[]=new int[100];// arrays syntax
        int i = 0;// define variable
        while(n > 0) { bin[i++] = n%2;n = n/2;} //loop syntax
        System.out.print("Binary number is : ");//printstatement to display result as binary number
        for(int j = i-1;j >= 0;j--)// loop syntax

            System.out.print(bin[j]);// printstatement to display result as binary number

    }
}



