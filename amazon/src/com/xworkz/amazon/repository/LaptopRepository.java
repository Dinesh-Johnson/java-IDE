package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.LaptopDTO;

import java.util.Collection;

public interface LaptopRepository {

    Collection<LaptopDTO> findAll();

}
