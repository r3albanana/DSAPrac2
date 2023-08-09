import java.util.*;

public class GCD
{
    public static void main(String[] args)
    {
     
        //change the numbers to check for GCD!
        int numberOne = 500;
        int numberTwo = 1500;
        
        int gcd = recursiveGCD(numberOne, numberTwo);

        System.out.println("The greatest common denominator of: " + numberOne + " " + "and" + " " + numberTwo + " " + "is" + " " + gcd);
        
    }


    // Resource used https://www.baeldung.com/java-greatest-common-divisor
    public static int recursiveGCD(int num, int numTwo)
    {
        if(numTwo == 0)
        {
            return num;
        }
        else
        {
            return recursiveGCD(numTwo, num % numTwo);
        }
    }
}