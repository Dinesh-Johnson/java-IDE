import java.util.Scanner;

public class GCDAndLCM{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a=");
        int a = sc.nextInt();
        System.out.println("Enter value of a=");
        int b=sc.nextInt();
        int x=a,y=b;
        while(y!=0){
            int t= y;
            y = x%y;
            x=t;
        }
        int gcd=x;

        int lcm= a*b/gcd;

        System.out.println("GCD of "+a+" and "+b+" is ="+gcd);
        System.out.println("LCM of "+a+" and "+b+" is ="+lcm);
    }
}
