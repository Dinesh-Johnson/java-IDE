package com.xworkx.in.guestmain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();
        data.add(45);
        data.add(150);
        data.add(30);
        data.add(110);
        data.add(80);

        Iterator<Integer> itr = data.iterator();
        while (itr.hasNext()) {
            if (itr.next() > 100) {
                itr.remove();
            }
        }
    }
}
