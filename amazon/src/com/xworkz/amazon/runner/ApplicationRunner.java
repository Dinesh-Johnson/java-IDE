package com.xworkz.amazon.runner;

import com.xworkz.amazon.constatnt.Type;
import com.xworkz.amazon.constatnt.Version;
import com.xworkz.amazon.repository.ApplicationRepository;
import com.xworkz.amazon.repository.ApplicationRepositoryImpl;
import com.xworkz.amazon.things.ApplicationDTO;
import com.xworkz.amazon.things.OwnerDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {

        ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();

        List<ApplicationDTO> application = applicationRepository.findAll();

        Type type = Type.ENTERTAINMENT;
        application.stream()
                .filter(applicationDTO -> applicationDTO.getType()== type).
                forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        String name = "Netflix";
        application.stream()
                .filter(apps->apps.getName()==name)
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        application.stream()
                .sorted((a1,a2)->a2.getCreatedDate().compareTo(a1.getCreatedDate()))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        application.stream()
                .sorted((a1,a2)->Double.compare(a2.getSize(),a1.getSize()))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        application.stream()
                .filter(applicationDTO -> applicationDTO.getName()== name && applicationDTO.getType() == type)
                .map(ApplicationDTO::getVersion)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        String ownerName = "Reed Hastings";
        application.stream()
                .filter(applicationDTO -> applicationDTO.getOwners().stream().anyMatch(e->e.getName()== ownerName))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        application.stream().filter(applicationDTO -> applicationDTO.getName()== name)
                .flatMap(e->e.getOwners().stream())
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        application.stream()
                .flatMap(e->e.getOwners().stream())
                .map(OwnerDTO::getEmail)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        Version version = Version.V3;
        application.stream().filter(applicationDTO -> applicationDTO.getType() == type && applicationDTO.getVersion() == version)
                .flatMap(e->e.getOwners().stream())
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        LocalDate date = LocalDate.of(2022, 5, 10);
        application.stream()
                .filter(applicationDTO -> applicationDTO.getCreatedDate().equals(date))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        ApplicationDTO newApp = new ApplicationDTO("SHAREit", Version.V2, LocalDate.of(2020, 6, 30), 150.00, Type.UTILITY, true, 0.0,
                Arrays.asList(new OwnerDTO("Michael Qiu", "michael@appmail.com", 9234567812l)));

        application.add(49,newApp); //ADD BY INDEX

        application.remove(33);//REMOVE BY INDEX

        System.out.println("-----------------------------------------------------------");

        OwnerDTO owner = application.get(10).getOwners().get(0);
        System.out.println(owner);

        System.out.println("-----------------------------------------------------------");
        application.set(48,newApp);

        String newName = "Netflix";

        application.stream()
                .filter(a->a.getName().equals(newName))
                .findFirst()
                .ifPresent(applicationDTO -> applicationDTO.setOwners(Arrays.asList(new OwnerDTO("Updated Owner", "updated@app.com", 9632587417l))));



    }
}
