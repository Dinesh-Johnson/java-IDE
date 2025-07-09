package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.MobileDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MobileRepoImpl implements MobileRepo{
    @Override
    public Collection<MobileDTO> findAll() {

        Collection<MobileDTO> collection = new ArrayList<>();
        MobileDTO mobile1 =new MobileDTO("Samsung", "S25 Ultra", 12, 111999.00);
        MobileDTO mobile2 =new MobileDTO("Apple", "iPhone 13", 4, 52999);
        MobileDTO mobile3 =new MobileDTO("Redmi", "Note 12", 8, 14999);
        MobileDTO mobile4 =new MobileDTO("OnePlus", "Nord CE", 12, 23999);
        MobileDTO mobile5 =new MobileDTO("Samsung", "M14", 6, 12999);

        collection.add(mobile1);
        collection.add(mobile2);
        collection.add(mobile3);
        collection.add(mobile4);
        collection.add(mobile5);
        return collection;
    }
}
