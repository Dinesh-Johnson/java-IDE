package com.xworkz.amazon.runner;

import com.xworkz.amazon.repository.DesktopRepoImpl;
import com.xworkz.amazon.repository.DesktopRepository;
import com.xworkz.amazon.things.DesktopDTO;

import java.util.Collection;
import java.util.Comparator;

public class DesktoRunner {

    public static void main(String[] args) {

        DesktopRepository desktopRepository = new DesktopRepoImpl();
        Collection<DesktopDTO> collection = desktopRepository.findAll();


        Comparator<DesktopDTO> comparator=(d1,d2)->d1.getName().compareTo(d2.getName());

        collection
                .stream()
                .sorted(comparator)
                .forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  collection
          .stream()
          .sorted((e1,e2)->Double.compare(e2.getCostPerItem(),e1.getCostPerItem()))
          .forEach(System.out::println);


       // practise(collection);
    }

    private static void practise(Collection<DesktopDTO> collection) {
        System.out.println("=============ALL PRODUCTS===================");
        collection.stream()
                .forEach(System.out::println);
        System.out.println("==============NAMES OF THE PRODUCTS==================");
        collection.stream()
                .map(DesktopDTO::getName)
                .forEach(System.out::println);
        System.out.println("==============PRODUCT GREATER THAN 10 % DISCOUNT==================");
        collection.stream()
                .filter(d->d.getDiscount()>10.00)
                .forEach(System.out::println);
        System.out.println("===============WARRANTY LESS THAN 3 YEARS=================");
        collection.stream()
                .filter(d->d.getWarrantyINYears()<3)
                .forEach(System.out::println);
        System.out.println("=============ASCENDING BY ID ===================");
        collection.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("=============Qty > 5 ===================");
        collection.stream()
                .filter(d->d.getQuantity()>5)
                .sorted()
                .forEach(System.out::println);
        System.out.println("=============Manufacturer Names ===================");
        collection.stream()
                .map(DesktopDTO::getManufacturer)
                .forEach(System.out::println);
        System.out.println("=============Minimum Discount ===================");
        collection.stream()
                .min(Comparator.comparing(DesktopDTO::getDiscount))
                .ifPresent(System.out::println);
        System.out.println("=============Latest date ===================");
        collection.stream()
                .max(Comparator.comparing(DesktopDTO::getManufacturedDate))
                .ifPresent(System.out::println);
        System.out.println("=============Maximum Cost perItem ===================");
        collection.stream()
                .max(Comparator.comparingDouble(DesktopDTO::getCostPerItem))
                .ifPresent(System.out::println);
    }
}
