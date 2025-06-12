package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.PassengerService;

import java.lang.reflect.Array;

public class PassengerApplication extends PassengerService {

    Passenger[] passenger=new Passenger[3];
    int index=0;

    @Override
    public boolean createPassenger(Passenger p) {
        if (index<passenger.length){
            System.out.println("Stoarge Available");
            passenger[index]=p;
            index++;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateByEmailID(String email, Passenger newP) {
        for (int i = 0; i < index; i++) {
            if (passenger[i].email==email){
                passenger[i]=newP;
                System.out.println(newP);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateBySeatNumber(int seatNumber, Passenger newP) {
        for (int i = 0; i < index; i++) {
            if (passenger[i].seatNumber==seatNumber){
                passenger[i]=newP;
                System.out.println(newP);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean searchPassengerBySeatNumber(int seatNumber) {
        for (int i = 0; i < index; i++) {
            if (passenger[i].seatNumber==seatNumber){
                System.out.println(passenger[i]);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean searchPassengerByEmail(String email) {
        for (int i = 0; i < index; i++) {
            if (passenger[i].email==email){
                System.out.println(passenger[i]);
                return true;
            }
        }
        return false;
    }

    @Override
    public void readAllPassengerDetails() {
        for (int i = 0; i < passenger.length; i++) {
            if (passenger[i]!=null){
                System.out.println(passenger[i]);
            }
        }
    }

    @Override
    public boolean deleteDetailsBySeatNumber(int seatNumber) {
        for (int i = 0; i < index; i++) {
            if (passenger[i].seatNumber==seatNumber){
                passenger[i]=null;
                System.out.println("Deleted Seat no. :"+seatNumber);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteDetailsByEmail(String email) {
        for (int i = 0; i < index; i++) {
            if (passenger[i].email==email){
                passenger[i]=null;
                System.out.println("Deleted: " + email);
                return true;
            }
        }
        return false;
    }
}
