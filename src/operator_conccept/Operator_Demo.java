package operator_conccept;

//https://www.sitesbay.com/java/operators-in-java
//https://www.w3schools.com/java/java_operators.asp
//Java Operator
//Operators are used to perform operations on variables and values.For example: +, -, *, / etc.
//In the example below, we use the + operator to add together two values:

//Java divides the operators into the following groups:

    //Arithmetic operators
    //Assignment operators
    //Comparison operators
    //Logical operators
    //Bitwise operators

public class Operator_Demo {

    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        x += y; // x = x+y = 12
        System.out.println(" x = "+x);

        x -= y; // x = x-y = 10 (updated value of x is 12, not 10)
        System.out.println(" x = "+x);

        x *= y; // x = x*y = 20 (updated value of x is 10, not 12)
        System.out.println(" x = "+x);

        x /= y; // x = x/y = 10 (updated value of x is 20, not 10)
        System.out.println(" x = "+x);

        x %= y; // x = x%y = 0 (updated value of x is 10, not 20)
        System.out.println(" x = "+x);
    }
}
