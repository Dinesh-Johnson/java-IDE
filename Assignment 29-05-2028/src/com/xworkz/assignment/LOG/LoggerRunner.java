package com.xworkz.assignment.LOG;

public class LoggerRunner {
    public static void main(String[] args) {

        Logger logger=new Logger();

        logger.log("Application started successfully.");
        logger.log("Failed to connect to database.", "ERROR");
        logger.log("Data processing complete.", "INFO", true);
    }
}
