
import java . util . *;// calling whole util package for scanner class
/*
write tabel of 8
8 x 1 = 8......8X10 = 80
 */

public class Table_8 {// class created for table 8
    public static void main(String[] args)// main method
    {
        Scanner s = new Scanner(System.in);// create an object in scanner
        System.out.print("Enter number: ");//printstatment
        int n=s.nextInt();//define object in next funcion syntax
        for(int i=1; i <= 10; i++)// predefine syntex for loop
        {
            System.out.println(n+" * "+i+" = "+n*i);//display in printstatment
        }
    }
}

