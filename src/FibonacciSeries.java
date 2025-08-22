import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n=10;
        int first = 0;
        int second = 1;
        int next=0;
        while (n>0){
            System.out.println(first);
            next= first +second;
            first =second;
            second = next;
            n--;
        }

    }
}
