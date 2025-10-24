import java.util.Scanner;

public class FibonacciCalculator {

    public static int fib(int n) {
        if (n == 0 || n == 1) { // base cases
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");  // user input prompt
        int n = sc.nextInt();                  // read input
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
        sc.close();
    }
}
