package com.xworkz.runner;

import com.xworkz.exception.ConditionCheckException;
import com.xworkz.exception.*;
import com.xworkz.exception.PowerCheckException;
import com.xworkz.exception.VoteCheckException;
import com.xworkz.runtimeexception.*;
import com.xworkz.throwable.*;

public class TCExceptionrunner {
    public static void main(String[] args) {

        int a=67;
        boolean Switch = false;
        String spelling="calcuator";
        int age =17;
        String week ="Sunday";
        int Mark = 30;
        String  email="qwert#gmail.co.in";
        int[] arrays={1,5,8,7,6};
        String password="qwerty";
        int year =1997;

        try {
            if (a%2 != 0){

                throw new ConditionCheckException("It is not Divisible By 2");
            }
        } catch (ConditionCheckException e) {
            e.printStackTrace();
        }

        try {
            if (Switch!=true){
                throw new PowerCheckException("Switch is OFF");
            }
        } catch (PowerCheckException e) {
                e.printStackTrace();
        }
        try {
            if (age<18){
                throw new VoteCheckException("You don't has a right age to Vote");
            }
        } catch (VoteCheckException e) {
            e.printStackTrace();
        }
        try {
            if (spelling!="calculator"){
                throw new SpellingCheckException("Spelling is Wrong");
            }
        } catch (SpellingCheckException e) {
            e.printStackTrace();
        }
        try {
            if (!(week.contains("Saturday"))){
                throw new WeekCheckException("It is Not WeekEnd");
            }
        } catch (WeekCheckException e) {
            e.printStackTrace();
        }
        try {
            if (a%2!=0){
                throw new DivideCheckException("It is a ODD Number");
            }
        } catch (DivideCheckException e) {
            e.printStackTrace();
        }
        try {
            if (Mark <40){
                throw new ResultCheckExcpetion("You are Failed");
            }
        } catch (ResultCheckExcpetion e) {
            e.printStackTrace();
        }
        try {
            if (email.contains("#")){
                throw new EmailCheckException("Invalid Email Address");
            }
        } catch (EmailCheckException e) {
            e.printStackTrace();
        }
        try {
            if (arrays.length<10){
                throw new ArrayCheckException("Array Length is low");
            }
        } catch (ArrayCheckException e) {
            e.printStackTrace();
        }
        try {
            if (!(email.endsWith(".com"))){
                throw new SuffixCheckException("The Suffix is Invalid");
            }
        } catch (SuffixCheckException e) {
            e.printStackTrace();
        }
        try {
            if (!(spelling.contentEquals("Z"))){
                throw new SpellCheckException("it has not have a Z");
            }
        } catch (SpellCheckException e) {
            e.printStackTrace();
        }
        try {
            if (!(spelling.startsWith("A"))){
                throw new PreffixCaseCheckException("The Word Not Start with A");
            }
        } catch (PreffixCaseCheckException e) {
            e.printStackTrace();
        }
        try {
            if (!(password.contains("@"))){
                throw new CharCheckException("Password not Contains Special Character");
            }
        } catch (CharCheckException e) {
            e.printStackTrace();
        }
        try {
            if (password.length()<10){
                throw new LengthCheckException("The Password Is too Short");
            }
        } catch (LengthCheckException e) {
            e.printStackTrace();
        }
        try {
            if (year < 2005){
                throw new YearCheckThrowable("Year is Not GEN-Z");
            }
        } catch (YearCheckThrowable e) {
            e.printStackTrace();
        }
    }
}
