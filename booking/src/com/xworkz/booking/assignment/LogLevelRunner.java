package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.LogLevel;

public class LogLevelRunner {
    public static void main(String[] args) {

        LogLevel level = LogLevel.ERROR;
        String message = "Something went wrong";

        if(level == LogLevel.INFO) {
            System.out.println("[INFO] " + message);
        }
        else if(level == LogLevel.DEBUG) {
            System.out.println("[DEBUG] " + message);
        }
        else if(level == LogLevel.WARN) {
            System.out.println("[WARN] " + message);
        }
        else if(level == LogLevel.ERROR) {
            System.out.println("[ERROR] " + message);
        }
    }
}
