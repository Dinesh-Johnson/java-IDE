import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String s =sc.nextLine();
        StringBuilder reverse= new StringBuilder();
        String ex = new StringBuilder(s).reverse().toString();
        System.out.println(ex);
        for (int i = s.length()-1; i >=0; i--) {
            reverse.append(s.charAt(i));
        }
        System.out.println("reversed Word:"+reverse);
        sc.close();
    }
}
