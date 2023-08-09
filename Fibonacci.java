import java.util.*;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println(fibonacciRecursive(3));
        System.out.println(fibonacciIterative(3));

        
    }

    public static int fibonacciRecursive(int num)
    {
        int fibValue = 0;

        if(num <= 1)
        {
            return num;
        }
        else 
        {
            fibValue = fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
        }
        return fibValue;
    }

    public static int fibonacciIterative(int num)
    {
        int fibValue = 0;
        int currValue = 1;
        int lastValue = 0;

        if(num == 0)
        {
            fibValue = 0;
        }
        else if(num == 1)
        {
            fibValue = 1;
        }
        else
        {
            for(int i = 2; i < num; i++)
            {
                fibValue = currValue + lastValue;
                lastValue = currValue;
                currValue = fibValue;
            }
        }
        return fibValue;
    }
}   

