package com.xworkz.assoication.ecommerce;

public class Review {
    String reviewer;
    String comment;

    public Review(String reviewer, String comment) {
        this.reviewer = reviewer;
        this.comment = comment;
    }

    public String toString() {
        return reviewer + ": " + comment;
    }
}
