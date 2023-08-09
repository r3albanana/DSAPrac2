import java.util.*;

public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println(recursiveFactorial(7));
        System.out.println(iterativeFactorial(5));
        
    }

    public static int recursiveFactorial(int num)
    {
        if(num < 0)
        {
            throw new IllegalArgumentException("Please use a positive value");
        }
        else if(num == 0)
        {
            return 1;
        }
        else
        {
            return num * recursiveFactorial(num - 1);
        }
    }

    public static int iterativeFactorial(int num)
    {
        
        if (num < 0)
        {
            throw new IllegalArgumentException("Please use a positive value");
        }
        else if(num == 0)
        {
            return 1;
        }
        else 
        {
            int factorial = 1;
            for(int i = num; i >= 2; i--)
            {
                factorial *= i;
            }
            return factorial;
        }
    }
}
