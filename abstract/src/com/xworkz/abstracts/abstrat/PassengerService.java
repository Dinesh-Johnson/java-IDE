package com.xworkz.abstracts.abstrat;

import com.xworkz.abstracts.child.Passenger;

public abstract class PassengerService {

    public abstract boolean createPassenger(Passenger p);
    public abstract boolean updateByEmailID(String email,Passenger newP);
    public abstract boolean updateBySeatNumber(int seatNumber,Passenger newP);
    public abstract boolean searchPassengerBySeatNumber(int seatNumber);
    public abstract boolean searchPassengerByEmail(String email);
    public abstract void readAllPassengerDetails();
    public abstract boolean deleteDetailsBySeatNumber(int seatNumber);
    public abstract boolean deleteDetailsByEmail(String email);
}
