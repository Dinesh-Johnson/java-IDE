package runner;

import com.xworkz.instance.Hotel;

public class HotelRunner {
    public static void main(String[] args) {

        Hotel hotel=new Hotel(388,"Suite Room");
        Hotel roomtype=new Hotel(388,"Suite Room", hotel.night_rate);

        System.out.println("Hotel name: " + hotel.name);
        System.out.println("Night Rate: " + hotel.night_rate);

    }
}
