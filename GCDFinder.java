import java.util.*;

public class GCDFinder{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Greater common denominator program!");
        System.out.println("What number would you like to find it for?");
        System.out.println("Please go ahead and enter!");

        int number = sc.nextInt();

        System.out.println("Please enter the second number!");
        
        int numberTwo = sc.nextInt();

        System.out.println(gCDenominator(number, numberTwo));
    }


    public static int gCDenominator(int n, int n2){

        //int greatestCommon;

        if(n < 0){

            throw new IllegalArgumentException("Enter a positive value!");
        }
        else if(n == 0){
            
            return n2;

        }
        else if(n2 > n){

            throw new IllegalArgumentException("Enter the highest value first!");

        }
        else{

            return gCDenominator(n2 % n, n);

        }
    }
}