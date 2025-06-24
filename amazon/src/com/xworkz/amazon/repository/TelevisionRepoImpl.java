package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.TelevisionDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TelevisionRepoImpl implements TelevisionRepository{
    @Override
    public Collection<TelevisionDTO> showAll() {


        TelevisionDTO television1 = new TelevisionDTO("Sony",65,"OLED",60000.00);
        TelevisionDTO television2 = new TelevisionDTO("Samsung",55,"QLED",50000.00);
        TelevisionDTO television3 = new TelevisionDTO("LG",45,"LED",30000.00);
        TelevisionDTO television4 = new TelevisionDTO("VU",50,"LED",32000.00);
        TelevisionDTO television5 = new TelevisionDTO("Mi",65,"LED",45000.00);

        Collection<TelevisionDTO> collection = new ArrayList<>();
        collection.add(television1);
        collection.add(television5);
        collection.add(television2);
        collection.add(television3);
        collection.add(television4);


        return collection;
    }
}
