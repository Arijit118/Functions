package Functions;
import java.util.*;
public class BinomialCoefficient {

    public static int factorial(int n) {
        int fact =1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n, int r) {
        int factOfN = factorial(n);
        int factOfR = factorial(r);
        int nSubstractionR = n-r;
        int factOfNSR = factorial(nSubstractionR);
        int binoCoefficient = factOfN / (factOfR * factOfNSR);

        return binoCoefficient;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binoCoefficient = binomialCoefficient(n, r);
        System.out.println("Binomial Coefficient is: " + binoCoefficient);
    }
}
