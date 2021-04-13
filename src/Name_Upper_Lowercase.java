
import java.util.Scanner; //calling java util package for scanner
import java.util.Locale; //calling java util package for locale

/*
Java program to convert your name uppercase into lowercase.
 */
public class Name_Upper_Lowercase {// class created bydefault
    public static void main(String[] args){// main method
        Scanner n = new Scanner(System.in);//creating object in scanner class
        System.out.println("Enter TEXT in Upper case: ");//printstatment to enter your data
        String name = n.next();//using object in syntax for next string
        String a = name.toLowerCase(Locale.ROOT);//call locale predefine syntax for lower cases
        System.out.println(a);// printstatement  to display result
    }
}
