package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.LaptopDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LaptopRepoImpl implements LaptopRepository{
    @Override
    public Collection<LaptopDTO> findAll() {
        Collection<LaptopDTO> collection= new ArrayList<>();
        LaptopDTO laptop1= new LaptopDTO("Dell", "i5", 512, 48999);
        LaptopDTO laptop2= new LaptopDTO("HP", "Ryzen 5", 1024, 52999);
        LaptopDTO laptop3= new LaptopDTO("Lenovo", "i3", 256, 38999);
        LaptopDTO laptop4= new LaptopDTO("Asus", "i7", 512, 59999);
        LaptopDTO laptop5= new LaptopDTO("Acer","i9",1024,239999);
        collection.add(laptop1);
        collection.add(laptop2);
        collection.add(laptop3);
        collection.add(laptop5);
        collection.add(laptop4);

        return collection;
    }
}
