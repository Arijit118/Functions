package Functions;
import java.util.*;
public class PrintPrimesInRange {

    public static boolean isPrime(int n) {
        boolean isPrimeNo = true;
        if(n==1) {
            isPrimeNo = false;
        } else if(n==2) {
            isPrimeNo = true;
        } else {
            for(int i=2; i<=n-1; i++) {
                if(n%i == 0){
                    isPrimeNo = false;
                }
            }
        }
        return isPrimeNo;
    }
    public static void primesInRange(int range) {
        for(int i=1; i<=range; i++) {
            if(isPrime(i) == true) {
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        primesInRange(range);
    }
}
