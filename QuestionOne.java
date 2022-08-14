package Functions;
import java.util.*;
public class QuestionOne {

    public static int findAverage(int a, int b, int c) {
        int average = (a + b + c)/ 3;
        return average;
    }
    public static void main(String args[]) {
        /*
         * Write a java method to compute average of three numbers.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = findAverage(a, b, c);
        System.out.println("Average of "+a+ " , "+b+" & "+c+" is "+average);
    }
}
