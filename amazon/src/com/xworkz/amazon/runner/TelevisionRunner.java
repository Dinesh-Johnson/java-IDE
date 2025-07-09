package com.xworkz.amazon.runner;

import com.xworkz.amazon.repository.TelevisionRepoImpl;
import com.xworkz.amazon.repository.TelevisionRepository;
import com.xworkz.amazon.things.TelevisionDTO;

import java.util.Collection;
import java.util.Iterator;

public class TelevisionRunner {
    public static void main(String[] args) {

        TelevisionRepository televisionRepository = new TelevisionRepoImpl();
        televisionRepository.showAll();
        Collection<TelevisionDTO> allTvs = televisionRepository.showAll();

        Iterator<TelevisionDTO> itr = allTvs.iterator();
        while (itr.hasNext()) {
            TelevisionDTO tv = itr.next();
            if (tv.getSizeInInches() > 50) {
                System.out.println(tv);
            }
        }
    }
}
