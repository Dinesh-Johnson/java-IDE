package com.xworkz.amazon.runner;

import com.xworkz.amazon.repository.LaptopRepoImpl;
import com.xworkz.amazon.repository.LaptopRepository;
import com.xworkz.amazon.things.LaptopDTO;

import java.util.Collection;

public class LapotopRunner {

    public static void main(String[] args) {

        LaptopRepository laptopRepository=new LaptopRepoImpl();
        Collection<LaptopDTO> collections=laptopRepository.findAll();

        for (LaptopDTO m : collections){
            if (m.getPrice() > 40000){
                System.out.println(m);
            }
        }

    }
}
