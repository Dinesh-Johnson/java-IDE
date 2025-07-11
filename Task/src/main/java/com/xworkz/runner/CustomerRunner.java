package com.xworkz.runner;


import com.xworkz.repository.CustomerImpl;
import com.xworkz.repository.CustomerRepository;
import dto.Customer;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerRunner {

    public static void main(String[] args) {


        CustomerRepository customerRepository = new CustomerImpl();

        Collection<Customer> customer = customerRepository.findAll();

    //Sort the collection by company:name in desc
        System.out.println("------------------------------------------------Sort the collection by company:name in desc--------------------------------------------------------------");

        customer.stream().sorted((e1,e2)->e2.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getName()
                .compareTo(e1.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getName()))
                .forEach(System.out::println);

    //Find a customer by job role
        System.out.println("--------------------------------------------Find a customer by job role------------------------------------------------------------------");

        String jobName = "Frontend Dev";

        customer.stream().filter(e->e.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getCeo().getHouse().getSecurity().getJob().getRole().equalsIgnoreCase(jobName))
                .forEach(System.out::println);

    //Sort by Country:name in desc
        System.out.println("---------------------------------------------Sort by Country:name in desc-----------------------------------------------------------------");
        customer.stream().sorted((e1,e2)->e2.getPassport().getCountry().getName().compareTo(e1.getPassport().getCountry().getName()))
                .forEach(System.out::println);

    // Sort by education:qualification in asc
        System.out.println("-------------------------------------------Sort by education:qualification in asc-------------------------------------------------------------------");
        customer.stream()
                .sorted((e1,e2)->e1.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getCeo().getHouse().getSecurity().getJob().getDetail().getEducation().getQualification()
                        .compareTo(e2.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getCeo().getHouse().getSecurity().getJob().getDetail().getEducation().getQualification()))
                .forEach(System.out::println);

    // Collect all unique Country
        System.out.println("------------------------------------------- Collect all unique Country-------------------------------------------------------------------");

        customer.stream()
                .map(e->e.getPassport().getCountry().getName()).distinct().collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------------------------------");




    }
}
