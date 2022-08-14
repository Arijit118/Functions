package Functions;
import java.util.*;
public class CalculateSumUsingMethod {

    public static void calculateSum(int a, int b) {//int a,b are parameter or formal parameter
        int sum = a + b;
        System.out.println("Sum of a & b is: " + sum);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);//here a,b is arguments
    }
}
