import java.util.*;

public class BaseConversion
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Base Converter");
        System.out.println("Please choose the base you would like to convert to:");
          
        int usersBase = getInput();

        System.out.println("Please enter the number you'd like converting!");
        
        int numberToConvert = getInput();

        System.out.println(convertWrapper(numberToConvert, usersBase));

    }

    public static int getInput()
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }


    //reference used: https://stackoverflow.com/questions/10184577/java-recursion-program-convert-a-base-10-number-to-any-base
    public static String convertWrapper(int num, int base)
    {
        int quotient = num / base;
        int remainder = num % base;

        if(quotient == 0)
        {
            return Integer.toString(remainder);
        }
        else if(num < 0)
        {
            throw new IllegalArgumentException("Please enter a positive value!");
        }
        else
        {
            return convert(quotient, base) + Integer.toString(remainder);
        }
    }

    private static String convert(int num, int base)
    {
        int quotient = num / base;
        int remainder = num % base;
        
        if(quotient == 0)
        {
            return Integer.toString(remainder);
        }
        else
        {
            return convert(quotient, base) + Integer.toString(remainder);
        }
    }

}   