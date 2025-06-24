package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.Appliances;

import java.util.Collection;

public interface  AppliancesRepository {

    Collection<Appliances> findAll();
}
