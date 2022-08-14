package Functions;
import java.util.*;
public class QuestionThree {
    public static boolean isPalindrome(int num) {
        boolean isPalindromeNo = false;
        int originalNum = num;
        int reverse = 0;
        
        
        while(originalNum != 0) {
          int lastDigit = originalNum % 10;
          reverse = reverse * 10 + lastDigit;
          originalNum = originalNum / 10;
        }
        if(num == reverse) {
           isPalindromeNo = true;
        }
        return isPalindromeNo;
    }
    public static void main(String args[]) {
        /*
         * Write a Java program to check if a number 
         * is a palindrome in Java? (121 is a palindrome, 321 is not).
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPalindrome(n)) {
            System.out.println(n + " is a Palindrome number.");
        } else {
            System.out.println(n+" is not a Palindrome number.");
        }
    }
}
