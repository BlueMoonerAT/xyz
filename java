import java.util.*;

public class print_prime {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) // Completely Dividing
            {
                return false;
            }
        }
        return true;
    }

    public static void primesinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till where you want List of Prime Numbers: ");
        int n = sc.nextInt();
        primesinrange(n);
    }
}
