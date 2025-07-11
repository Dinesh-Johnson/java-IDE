package com.xworkz.repository;

import dto.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CustomerImpl implements CustomerRepository{

    @Override
    public Collection<Customer> findAll() {

        Collection<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Dinesh",28,"Male",
                new Passport("P101", LocalDate.of(2015, 1, 1), LocalDate.of(2025, 1, 1),
                        new Country("India", "IN", 1400000000,
                                new President("Narendra Modi", 10, 73,
                                        new Driver("Ramu", "DL001", 10,new Vehicle("Car", "i20", "DL01G1234",
                                                new Company("Tata Group", "Conglomerate", "Mumbai",
                                                        new CEO("Natarajan Chandrasekaran", 60, 90000000,
                                                                new House("Velachery", 2, true,
                                                                        new Security("SEC001", "Gated", 3,
                                                                                new Job("Developer", 50000, "Chennai",
                                                                                        new Detail("D001", "Spring Dev", "Mid",
                                                                                                new Education("B.E", "Anna University", 2015, 8.2))))))))))))));
        customers.add(new Customer("Ohm", 34, "Male",
                new Passport("P103", LocalDate.of(2016, 10, 10), LocalDate.of(2026, 10, 10),
                        new Country("France", "FR", 67000000,
                                new President("Emmanuel Macron", 7, 46,
                                        new Driver("Pierre", "DL003", 12,
                                                new Vehicle("Sedan", "Peugeot 308", "FR45678",
                                                        new Company("L'Oréal", "Cosmetics", "Paris",
                                                                new CEO("Nicolas Hieronimus", 58, 85000000,
                                                                        new House("Paris 7e", 4, true,
                                                                                new Security("SEC003", "High-Tech", 5,
                                                                                        new Job("Beauty Analyst", 85000, "Paris",
                                                                                                new Detail("D003", "Marketing", "Lead",
                                                                                                        new Education("M.B.A", "HEC Paris", 2013, 9.0))))))))))))));



        return customers;
    }
}
