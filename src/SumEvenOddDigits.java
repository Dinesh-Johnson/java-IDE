import java.util.Scanner;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            temp /= 10;
        }

        System.out.println("Sum of even digits = " + evenSum);
        System.out.println("Sum of odd digits  = " + oddSum);

        sc.close();
    }
}
