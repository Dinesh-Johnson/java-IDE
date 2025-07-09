package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.MobileDTO;

import java.util.Collection;

public interface MobileRepo {

    Collection<MobileDTO> findAll();
}
