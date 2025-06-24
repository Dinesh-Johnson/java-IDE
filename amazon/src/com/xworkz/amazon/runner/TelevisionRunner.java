package com.xworkz.amazon.runner;

import com.xworkz.amazon.repository.TelevisionRepoImpl;
import com.xworkz.amazon.repository.TelevisionRepository;
import com.xworkz.amazon.things.Appliances;
import com.xworkz.amazon.things.TelevisionDTO;

import java.util.Collection;

public class TelevisionRunner {
    public static void main(String[] args) {

        TelevisionRepository televisionRepository = new TelevisionRepoImpl();
        televisionRepository.showAll();
        Collection<TelevisionDTO> allTvs = televisionRepository.showAll();

        for(TelevisionDTO a : allTvs){
            if (a.getSizeInInches() >50) {
                System.out.println(a);
            }
        }
    }
}
