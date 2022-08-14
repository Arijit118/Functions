package Functions;
import java.util.*;
public class BinaryToDecimalConverter {
    public static void binaryToDecimal(int binNum) {
        int binaryNum = binNum;
        int pow = 0;
        int decNo = 0;

        while(binNum>0) {
            int LD = binNum % 10;//LD is last digit
            decNo = decNo + (LD * (int)Math.pow(2, pow));
            binNum = binNum / 10;
            pow++;
        }
        System.out.println("Decimal of " + binaryNum + " is: " + decNo);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binaryToDecimal(n);
    }
}
