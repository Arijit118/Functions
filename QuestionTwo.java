package Functions;

public class QuestionTwo {
    public static boolean isEven(int n) {
        boolean isEvenNo = false;
        if(n%2==0) {
            isEvenNo = true;
        }
        return isEvenNo;
    }
    public static void main(String args[]) {
        /*
         * Write a method named isEven that accepts an int argument.
         * The method should return true if the argument iseven, or
         * false otherwise. Also write a program to test your method.
         */
        System.out.println(isEven(11));
    }
}
