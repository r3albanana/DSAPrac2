import java.util.*;

public class BaseConverter{

    public static void main(String[] args){

        System.out.println("Welcome to the Base Converter program!");

        int baseTenNumber;
        int conversionBase;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the base 10 number.");
        baseTenNumber = sc.nextInt();

        System.out.println("Please enter the base you want it converted to: 2-16.");
        conversionBase = sc.nextInt();

        System.out.println(conversion(baseTenNumber, conversionBase));

        sc.close();
    }

    public static String conversion(int number, int base){

        int quotient = number / base;
        int remainder = number % base;

        if(quotient == 0){

            return Integer.toString(remainder);

        }else if(number < 0){

            throw new IllegalArgumentException("Please enter a positive value!"); 

        }else if(base > 10){

            return conversion(quotient, base) + Integer.toString(remainder);
        
        }else{

            return conversion(quotient, base) + Integer.toHexString(remainder);

        }


        
    }


}