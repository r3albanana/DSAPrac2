import java.util.*;

public class FactorialPractice{

    public static void main(String[] args){

        System.out.println("Welcome to the program");
        System.out.println("This is a basic Factorial program");
        System.out.println("It uses both a recursive approach and iterative approach");

        //System.out.println(RFactorial(5));
        //System.out.println(IFactorial(5));

        String selection;
        int numberChosen = 5;

        System.out.println("Please make your selection: 1 = Recursive 2 = Iterative");
        Scanner sc = new Scanner(System.in);
        
        selection = sc.nextLine();
        sc.close();

        switch (selection) {
            
            case "1":
                    System.out.println(RFactorial(numberChosen));
                break;
            case "2":
                    System.out.println(IFactorial(numberChosen));

            default:
                break;
        }




    } 

    public static int RFactorial(int n){


        if(n < 0){

            throw new IllegalArgumentException("Please enter a positive value");

        }
        else if(n == 0){

            return 1;

        }
        else{

            return n * RFactorial(n - 1);

        }
    }

    public static int IFactorial(int n){

        if(n < 0){

            throw new IllegalArgumentException("Please enter a positive value!");

        }else if(n == 0){

            return 1;

        }else{

            int factorial = 1;

            for(int i = n; i >= 2; i--){

                factorial *= i;

            }

            return factorial;
        }
    }
}