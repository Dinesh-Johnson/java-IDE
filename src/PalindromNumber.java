public class PalindromNumber {

    public static void main(String[] args) {

        int number=232;
        int reverse =number;
        int check=0;
        while(number>0) {
            int digit=number % 10;
            check = check *10+digit ;
            number /= 10;
        }
        if (check == reverse) {
            System.out.println(reverse + "- is the Palindrome");
        }else {
            System.out.println(reverse + "- is not Palindrome");
        }
    }
}
