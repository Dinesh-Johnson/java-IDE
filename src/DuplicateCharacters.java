import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Here..");
        String str = sc.nextLine();
        str = str.toLowerCase();  // ignore case

        System.out.println("Duplicate characters are:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println(ch);
            }
        }
    }
}
