package com.xworkz.amazon.runner;

import com.xworkz.amazon.repository.ShirtRepoImpl;
import com.xworkz.amazon.repository.ShirtRepository;
import com.xworkz.amazon.things.ShirtDTO;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ShirtRunner {
    public static void main(String[] args) {

        ShirtRepository shirtRepository=new ShirtRepoImpl();
        Collection<ShirtDTO> collection= shirtRepository.findAll();

        Iterator<ShirtDTO> itr = collection.iterator();
        while (itr.hasNext()) {
            ShirtDTO s = itr.next();
            if (s.getSize() == "XL") {
                System.out.println(s);
            }
        }
    }
}
