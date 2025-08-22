public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 265;
        int original = num;
        int sum = 0;

        while (num > 0) {
            int d = num % 10;
            sum = sum + (d * d * d);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
        }
    }
}
