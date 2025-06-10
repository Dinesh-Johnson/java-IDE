package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.Season;

public class SeasonRunner {
    public static void main(String[] args) {
        Season season = Season.SUMMER;

        if (season == Season.WINTER) {
            System.out.println("Go skiing");
        } else if (season == Season.SPRING) {
            System.out.println("Go for a walk");
        } else if (season == Season.SUMMER) {
            System.out.println("Go swimming");
        } else if (season == Season.FALL) {
            System.out.println("Watch the leaves fall");
        }
    }
}
