package Functions;
import java.util.*;
public class CalculateProductOfTwoNumbers {
    public static int findProduct(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int productOfAandB = findProduct(a, b);
        System.out.println("Product of " + a + " & " + b + " is :" + productOfAandB);
    }
}
