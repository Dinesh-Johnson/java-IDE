import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = sc.nextLine();
        int vowels=0,constant=0,digits=0,spaces=0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if ("aeiouAEIOU".indexOf(ch)!=-1){
                vowels++;
            } else if (Character.isLetter(ch)) {
                constant++;
            }else if (Character.isDigit(ch)){
                digits++;
            }else if (Character.isSpaceChar(ch)){
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + constant);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespaces: " + spaces);

        sc.close();
    }
}
