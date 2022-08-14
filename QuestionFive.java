package Functions;
import java.util.*;
public class QuestionFive {
    public static void sumOfDigits(int n) {
        int sumOfDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        System.out.println("Sum of all digits: "+sumOfDigits);
    }
    public static void main(String args[]) {
        /*
         * Write a Java method to compute the sum of the digits in an integer.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfDigits(n);
    }
}
