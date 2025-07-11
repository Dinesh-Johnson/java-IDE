package com.xworkz.repository;

import dto.Customer;

import java.util.Collection;

public interface CustomerRepository {

    Collection<Customer> findAll();
}
