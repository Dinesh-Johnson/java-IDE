import java.util.Scanner;

public class LargestSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largest = 0, smallest = 9;
        int temp = Math.abs(n);

        if (temp == 0) {
            largest = smallest = 0;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                if (digit > largest)
                    largest = digit;
                if (digit < smallest)
                    smallest = digit;
                temp /= 10;
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Smallest digit = " + smallest);

        sc.close();
    }
}
