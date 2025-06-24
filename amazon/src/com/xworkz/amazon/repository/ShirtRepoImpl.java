package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.ShirtDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShirtRepoImpl implements ShirtRepository{
    @Override
    public Collection<ShirtDTO> findAll() {

        Collection<ShirtDTO>collection=new ArrayList<>();

        ShirtDTO shirt1=new ShirtDTO("Peter England", "L", "Blue", 1499);
        ShirtDTO shirt2=new ShirtDTO("Arrow", "M", "White", 1799);
        ShirtDTO shirt3=new ShirtDTO("Zara", "XL", "Black", 2499);
        ShirtDTO shirt4=new ShirtDTO("Allen Solly", "M", "Green", 1999);
        ShirtDTO shirt5=new ShirtDTO("Van Heusen", "XL", "Maroon", 2499);

        collection.add(shirt2);
        collection.add(shirt1);
        collection.add(shirt5);
        collection.add(shirt3);
        collection.add(shirt4);

        return collection;
    }
}
