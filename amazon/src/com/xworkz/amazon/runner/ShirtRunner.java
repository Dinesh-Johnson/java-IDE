package com.xworkz.amazon.runner;

import com.xworkz.amazon.repository.ShirtRepoImpl;
import com.xworkz.amazon.repository.ShirtRepository;
import com.xworkz.amazon.things.ShirtDTO;

import java.util.Collection;
import java.util.Collections;

public class ShirtRunner {
    public static void main(String[] args) {

        ShirtRepository shirtRepository=new ShirtRepoImpl();
        Collection<ShirtDTO> collection= shirtRepository.findAll();

        for (ShirtDTO s:collection){
            if (s.getSize() =="XL"){
                System.out.println(s);
            }
        }
    }
}
