package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.ShirtDTO;

import java.util.Collection;

public interface ShirtRepository {

    Collection<ShirtDTO> findAll();
}
