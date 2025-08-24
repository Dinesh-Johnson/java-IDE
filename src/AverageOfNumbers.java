import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        double sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            double num = sc.nextDouble();
            sum += num;
        }

        double average = sum / n;

        System.out.println("Average = " + average);

        sc.close();
    }
}
