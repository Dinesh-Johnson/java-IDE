public class ReverseNumber {
    public static void main(String[] args) {

        int num =12345;
        int check=0;
        while (num>0){
            int d=num%10;
            check=check*10+d;
            num/=10;
        }
        System.out.println("Reverse of 12345 is :"+check);
    }
}
