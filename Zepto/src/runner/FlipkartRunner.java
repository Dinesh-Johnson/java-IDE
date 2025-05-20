package runner;

import com.sun.istack.internal.NotNull;
import com.xworkz.zepto.products.Flipkart;

import static com.xworkz.zepto.products.Flipkart.item;

public class FlipkartRunner {

    public static void main(String[] args) {

        Flipkart.appName();
        System.out.println();

        Flipkart.item("Ice-Cream");
        System.out.println();

        Flipkart.brand("Ice-Cream","Baskkin's Robbins",150);
        System.out.println();

        Flipkart.reviews("Baskkin's Robbins","New","*****(5)");
        System.out.println();

        Flipkart.itemReviews("Ice-Cream","*****(5)",150);
        System.out.println();

        Flipkart.checkOut("Ice-Cream","*****(5)","Baskkin's Robbins",0.50,150);
        System.out.println();

        String[] names={"The Ice cream names"};
        Flipkart.itemBrand(names);

        System.out.println();

        String[] branding={"Arun Ice-Cream","Baskkin's Robbins"};
        Flipkart.brandName(branding);

        System.out.println();

        String[] checkin={"Arun Ice-Cream","Ice-cream"};
        Flipkart.checkingOut(names,branding);


    }
}
