package com.xworkz.things.methods;

public class House {
public Room[] rooms;

    public House(Room[] rooms) {
        this.rooms = rooms;
    }

    public void showRooms() {
        for (int i = 0; i < rooms.length; i++) {
         System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Room[] rs = { new Room("Living"), new Room("Kitchen") };
        House h = new House(rs);
        h.showRooms();
    }
}