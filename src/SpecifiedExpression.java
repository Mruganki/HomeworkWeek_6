public class SpecifiedExpression {
    /*
    12. Write a Java program to compute the specified expressions and print the output.
    Test Data:
            ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    Expected Output : 2.138888888888889
    */
       public static void main(String[] args){// main method
           double a= 25.5;// datatype,variable, value
           double b= 3.5;//datatype,variable, value
           double c= 40.5;//datatype,variable, value
           double e= 4.5;//datatype,variable, value
           double x = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));// variable given for defined formula to print result
           System.out.println("Expected output : " + x);
       }
}
