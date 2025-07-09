package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.LaptopDTO;

import java.util.Collection;

@FunctionalInterface
public interface LaptopRepository {

    Collection<LaptopDTO> findAll();

}
