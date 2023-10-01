
import java.util.Scanner;

public class FibFact{

    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive function to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for Fibonacci and factorial calculation: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int fibResult = fibonacci(num);
            int factorialResult = factorial(num);
            
            System.out.println("Fibonacci(" + num + ") = " + fibResult);
            System.out.println("Factorial(" + num + ") = " + factorialResult);
        }
        
        scanner.close();
    }
}
