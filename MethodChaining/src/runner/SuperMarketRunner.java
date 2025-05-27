package runner;

import com.xworz.method.SuperMarket;

public class SuperMarketRunner {
    public static void main(String[] args) {

        SuperMarket s=new SuperMarket("D-Mart");
        System.out.println();

        s.store();
        SuperMarket.offer();
    }
}
