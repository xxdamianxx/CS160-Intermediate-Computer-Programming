// This is a recursive program which gives the factorial of a number

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}