package Functions;
import java.util.*;
public class CheckPrimeNumber {
    public static void isPrime(int n) {
        boolean isPrime = true;
        if(n == 1) {
            isPrime = false;
        } else if(n == 2) {
           isPrime = true;
        } else {
            for(int i=2; i<=Math.sqrt(n); i++) {//we can use also i<=n-1 but i<=Math.sqrt(n) is more optimized.
                if(n%i == 0) {
                    isPrime = false;
                }
            }
        }
        if(isPrime == true) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }
}
