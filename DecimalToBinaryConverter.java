package Functions;
import java.util.*;
public class DecimalToBinaryConverter {

    public static void decToBin(int decNum) {
        int decimalNum = decNum;
        int pow = 0;//pow is power
        int binNum = 0;//binNum is binaryNumber

        while(decNum>0) {
            int rem = decNum % 2;//rem is remainder
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of " + decimalNum + " is: " + binNum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBin(n);
    }
}
