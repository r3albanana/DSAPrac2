import java.util.*;

public class FibonacciPractice{

    public static void main(String[] args){

        System.out.println("Welcome to the Fibonacci program");
        System.out.println("Please enter how long you'd like the sequence to be!");

        Scanner sc = new Scanner(System.in);
        int amount = 0;
        amount = sc.nextInt();
        sc.close();

        System.out.println("This is the answer");
        System.out.println(RecursiveFibonacci(amount));
    }

    public static int RecursiveFibonacci(int n){

        int fibValue = 0;

        if(n <= 1){

            return n;

        }
        else{

            fibValue = RecursiveFibonacci(n - 1) + RecursiveFibonacci(n - 2);

        }
        return fibValue;
    }

    public static int IterativeFibonacci(int n){

        int fibValue = 0;
        int currentValue = 1;
        int lastValue = 0;

        if(n == 0){

            fibValue = 0;

        }else if(n == 1){

            fibValue = 1;

        }else{

            for(int i = 2; i < n; i++){

                fibValue = currentValue + lastValue;
                lastValue = currentValue;
                currentValue = fibValue;

            }

        }
        return fibValue;
    }
}