package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.abstrat.PassengerService;
import com.xworkz.abstracts.child.Passenger;
import com.xworkz.abstracts.child.PassengerApplication;

public class PassengerRunner {
    public static void main(String[] args) {

        Passenger passenger1= new Passenger();
        passenger1.name="Dinesh";
        passenger1.email="qwerty@gmail.com";
        passenger1.seatNumber=1;
        passenger1.contactNumber=789456123;
        passenger1.pickupLocation="Salem";
        passenger1.dropLocation="Bangalore";

        Passenger passenger2= new Passenger();
        passenger2.name="Kiran";
        passenger2.email="asdf@gmail.com";
        passenger2.seatNumber=2;
        passenger2.contactNumber=987654321;
        passenger2.pickupLocation="Salem";
        passenger2.dropLocation="Bangalore";

        Passenger passenger3= new Passenger();
        passenger3.name="Vinodha";
        passenger3.email="zxcvb@gmail.com";
        passenger3.seatNumber=3;
        passenger3.contactNumber=654987321;
        passenger3.pickupLocation="Salem";
        passenger3.dropLocation="Bangalore";

        PassengerService app = new PassengerApplication();

        app.createPassenger(passenger1);
        app.createPassenger(passenger2);
        app.createPassenger(passenger3);
        System.out.println();
        System.out.println("======UPDATED BY MAIL======");
        boolean update1 = app.updateByEmailID("asdf@gmail.com",passenger2);
        if (update1){
            System.out.println();
        }
        System.out.println("======UPDATED BY SEAT NO======");
        boolean update2=app.updateBySeatNumber(2,passenger2);
        if (update2){
            System.out.println(update2);
        }
        System.out.println("======SEARCHING PASSENGER BY SEAT NO.======");
        boolean search1=app.searchPassengerBySeatNumber(3);
        if (search1){
            System.out.println();
        }
        System.out.println("======SEARCHING PASSENGER BY MAIL ID======");
        boolean search2=app.searchPassengerByEmail("asdf@gmail.com");
        if (search2){
            System.out.println();
        }
        System.out.println("======ALL PASSENGER DEATILS======");
        app.readAllPassengerDetails();
        System.out.println("======PASSENGER DELETED AMIL ID======");
        boolean delete1 = app.deleteDetailsByEmail("asdf@gmail.com");
        if (delete1){
            System.out.println();
        }

        System.out.println("======PASSENGER DELETED BY SEAT NUMBER======");
        boolean delete2 = app.deleteDetailsBySeatNumber(1);
        if (delete2){
            System.out.println();
        }




    }
}
