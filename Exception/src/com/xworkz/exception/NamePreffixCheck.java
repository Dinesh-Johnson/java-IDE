package com.xworkz.exception;

public class NamePreffixCheck extends RuntimeException{

    public NamePreffixCheck(String nameCheckSuffixExcep){
        super(nameCheckSuffixExcep);
    }
}
