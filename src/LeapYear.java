import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%4==0 && n%100!=0 ){
            System.out.println("It is a Leap Year");
        }else {
            System.out.println("it is not a Leap Year");
        }
    }
}
