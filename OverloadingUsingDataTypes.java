package Functions;

public class OverloadingUsingDataTypes {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String args[]) {
        System.out.println(sum(6, 4));
        System.out.println(sum(6.2f, 3.5f));
    }
}
