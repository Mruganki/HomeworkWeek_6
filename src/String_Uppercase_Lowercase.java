import java.util.*;// callING java util package to support scanner class AND LOCALE (* IS FOR EVERING)
/*Created by : Mruganki Padarthi

 Write a Java program to convert a given string into lowercase.

Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */

public class String_Uppercase_Lowercase {// class created by default
    //write a program to convert the upper case to lower case

    public static void main(String[] args){//main method

        Scanner n = new Scanner(System.in);//creating object in scanner class
        System.out.println("Enter TEXT in Upper case: ");//printstatment to enter your data
        String userinputString =n.nextLine();//using object to syntax for next string
        String N = userinputString.toLowerCase(Locale.ROOT);//call locale predefine syntax for lower cases
        System.out.println(N);// printstatement  to display result

    }




}
