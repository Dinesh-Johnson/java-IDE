package com.xworkz.amazon.runner;

import com.xworkz.amazon.repository.LaptopRepoImpl;
import com.xworkz.amazon.repository.LaptopRepository;
import com.xworkz.amazon.things.LaptopDTO;

import java.util.Collection;
import java.util.Iterator;

public class LapotopRunner {

    public static void main(String[] args) {

        LaptopRepository laptopRepository=new LaptopRepoImpl();
        Collection<LaptopDTO> collections=laptopRepository.findAll();

        Iterator<LaptopDTO> itr = collections.iterator();
        while (itr.hasNext()) {
            LaptopDTO l = itr.next();
            if (l.getPrice() > 40000) {
                System.out.println(l);
            }
        }

    }
}
