public class FactorialRecursion {
    public static void main(String[] args) {
        int num = 10;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " = " + result);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
