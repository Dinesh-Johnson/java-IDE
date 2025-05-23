package runner;

import com.xworkz.inheritence.Festival;

public class FestivalRunner {

    public static void main(String[] args) {
        new Festival();
        System.out.println("************");

        new Festival("Christmas");
        System.out.println();

        new Festival(25,"December");
        System.out.println();

        Festival h =new Festival();
        h.holiday="Winter Holidays";
        h.winter();
    }
}
