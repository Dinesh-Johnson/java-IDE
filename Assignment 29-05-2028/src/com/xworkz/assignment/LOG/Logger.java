package com.xworkz.assignment.LOG;

public class Logger {
    //5. Logger Utility
    //Context: Logging system in software applications
    //Description:
    //Create a class Logger and overload the method log():
    //log(String message) ? Default log
    //log(String message, String level) ? Log with level (INFO, ERROR)
    //log(String message, String level, boolean writeToFile) ? Log with file output


    public void log(String message){
        System.out.println("[LOG] " + message);
    }
    public void log(String message,String level){
        System.out.println("[" + level + "] " + message);
    }
    public void log(String message, String level, boolean writeToFile) {
        if (writeToFile) {
            System.out.println("Writing to file: [" + level + "] " + message);
        } else {
            log(message, level);
        }
    }

}
