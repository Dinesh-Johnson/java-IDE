package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.Direction;

public class DirectionRunner {
    public static void showDirection(Direction dir) {
        if (dir == Direction.NORTH) {
            System.out.println("Facing North");
        } else if (dir == Direction.SOUTH) {
            System.out.println("Facing South");
        } else if (dir == Direction.EAST) {
            System.out.println("Facing East");
        } else if (dir == Direction.WEST) {
            System.out.println("Facing West");
        }
    }

    public static void main(String[] args) {
        showDirection(Direction.EAST);
    }
}
