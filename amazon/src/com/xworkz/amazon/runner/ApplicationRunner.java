package com.xworkz.amazon.runner;

import com.xworkz.amazon.constatnt.Type;
import com.xworkz.amazon.constatnt.Version;
import com.xworkz.amazon.repository.ApplicationRepository;
import com.xworkz.amazon.repository.ApplicationRepositoryImpl;
import com.xworkz.amazon.things.ApplicationDTO;
import com.xworkz.amazon.things.OwnerDTO;

import java.time.LocalDate;
import java.util.*;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();

        List<ApplicationDTO> application = applicationRepository.findAll();

       // streamMethod(application);
       // listiteratorMethods(application);

        Map<String,String> appMap = new HashMap<>();

        //create
        appMap.put("Netflix", "Entertainment");
        appMap.put("Zoom", "Utility");
        appMap.put("Spotify", "Music");
        System.out.println(appMap);

        //read
        System.out.println(appMap.get("Netflix"));

        //delete
        appMap.remove("Spotify");
        System.out.println("After delete : "+appMap);

//        update
        appMap.put("Zoom","Online Meetings");
        System.out.println("After Update: "+appMap);

    }

    private static void listiteratorMethods(List<ApplicationDTO> application) {
        int index = 10;
        ListIterator<ApplicationDTO> listIteratorDesc = application.listIterator(application.size());

        while (listIteratorDesc.hasPrevious()){
            System.out.println(listIteratorDesc.previous().getName());
        }
        while (listIteratorDesc.hasPrevious()){
            if (listIteratorDesc.next().getName().equals("Telegram")){
                listIteratorDesc.add(new ApplicationDTO("New",Version.V3,LocalDate.of(2025,7,7),100,Type.ENTERTAINMENT,true,0,new ArrayList<>((Collection) new OwnerDTO("New owner","new@mail.com",98574135l))));

            }
        }
        System.out.println("-----------------------------------------------------------");
        ListIterator<ApplicationDTO> listIteratorAsec = application.listIterator(10);
        while (listIteratorDesc.hasPrevious()){
            System.out.println(listIteratorAsec.previous().getName());

        }

        System.out.println("-----------------------------------------------------------");
    }

    private static void streamMethod(List<ApplicationDTO> application) {
        //1
        Type type = Type.ENTERTAINMENT;
        application.stream()
                .filter(applicationDTO -> applicationDTO.getType()== type).
                forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        //2
        String name = "Netflix";
        application.stream()
                .filter(apps->apps.getName().equals(name))
                .forEach(System.out::println);
        //3
        System.out.println("-----------------------------------------------------------");
        application.stream()
                .sorted((a1,a2)->a2.getCreatedDate().compareTo(a1.getCreatedDate()))
                .forEach(System.out::println);

        //4
        System.out.println("-----------------------------------------------------------");
        application.stream()
                .sorted((a1,a2)->Double.compare(a2.getSize(),a1.getSize()))
                .forEach(System.out::println);

        //5
        System.out.println("-----------------------------------------------------------");
        application.stream()
                .filter(applicationDTO -> applicationDTO.getName().equals(name) && applicationDTO.getType().equals(type))
                .map(ApplicationDTO::getVersion)
                .forEach(System.out::println);

        //6
        System.out.println("-----------------------------------------------------------");
        String ownerName = "Reed Hastings";
        application.stream()
                .filter(applicationDTO -> applicationDTO.getOwners().stream().anyMatch(e->e.getName()== ownerName))
                .forEach(System.out::println);

        //7
        System.out.println("-----------------------------------------------------------");
        application.stream().filter(applicationDTO -> applicationDTO.getName().equals( name))
                .flatMap(e->e.getOwners().stream())
                .forEach(System.out::println);

        //8
        System.out.println("-----------------------------------------------------------");
        application.stream()
                .flatMap(e->e.getOwners().stream())
                .map(OwnerDTO::getEmail)
                .forEach(System.out::println);

        //9
        System.out.println("-----------------------------------------------------------");
        Version version = Version.V3;
        application.stream().filter(applicationDTO -> applicationDTO.getType() == type && applicationDTO.getVersion() == version)
                .flatMap(e->e.getOwners().stream())
                .forEach(System.out::println);

        //10
        System.out.println("-----------------------------------------------------------");
        LocalDate date = LocalDate.of(2022, 5, 10);
        application.stream()
                .filter(applicationDTO -> applicationDTO.getCreatedDate().equals(date))
                .forEach(System.out::println);

        //11
        System.out.println("-----------------------------------------------------------");
        ApplicationDTO newApp = new ApplicationDTO("SHAREit", Version.V2, LocalDate.of(2020, 6, 30), 150.00, Type.UTILITY, true, 0.0,
                Arrays.asList(new OwnerDTO("Michael Qiu", "michael@appmail.com", 9234567812l)));

        //12
        application.add(49,newApp); //ADD BY INDEX

        //13
        application.remove(33);//REMOVE BY INDEX

        //14
        System.out.println("-----------------------------------------------------------");

        OwnerDTO owner = application.get(10).getOwners().get(0);
        System.out.println(owner);

        //15
        System.out.println("-----------------------------------------------------------");
        application.set(48,newApp);

        String newName = "Netflix";

        application.stream()
                .filter(a->a.getName().equals(newName))
                .findFirst()
                .ifPresent(applicationDTO -> applicationDTO.setOwners(Arrays.asList(new OwnerDTO("Updated Owner", "updated@app.com", 9632587417l))));
    }
}
