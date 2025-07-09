package com.xworkz.runner;

import com.xworkz.exception.*;
import com.xworkz.runtimeexception.*;
import com.xworkz.throwable.*;

public class ExceptionRunner {

    public static void main(String[] args)throws ConditionCheckException, PowerCheckException, SpellingCheckException, VoteCheckException, WeekCheckException, DivideCheckException, ResultCheckExcpetion, SpellCheckException, SuffixCheckException, PreffixCaseCheckException, ArrayCheckException, CharCheckException, EmailCheckException, LengthCheckException, YearCheckThrowable {

        int a=67;
        boolean Switch = false;
        String spelling="calculator";
        int age =17;
        String week ="Sunday";
        int Mark = 30;
        String  email="qwert#gmail.co.in";
        int[] arrays={1,5,8,7,6};
        String password="qwerty";
        int year =1997;

        if (a%2 != 0){

            throw new ConditionCheckException("It is not Divisible By 2");
        }
        if (Switch!=true){
            throw new PowerCheckException("Switch is OFF");
        }
        if (age<18){
            throw new VoteCheckException("You don't has a right age to Vote");
        }
        if (spelling!="calculator"){
            throw new SpellingCheckException("Spelling is Wrong");
        }
        if (week!="Saturday"){
            throw new WeekCheckException("It is Not WeekEnd");
        }
        if (a%2!=1){
            throw new DivideCheckException("It is a ODD Number");
        }
        if (Mark <40){
            throw new ResultCheckExcpetion("You are Failed");
        }
        if (email.contains("#")){
            throw new EmailCheckException("Invalid Email Address");
        }
        if (arrays.length<10){
            throw new ArrayCheckException("Array Length is low");
        }
        if (!(email.endsWith(".com"))){
            throw new SuffixCheckException("The Suffix is Invalid");
        }
        if (!(spelling.contentEquals("Z"))){
            throw new SpellCheckException("it has not have a Z");
        }
        if (!(spelling.startsWith("A"))){
            throw new PreffixCaseCheckException("The Word Not Start with A");
        }
        if (password.length()<10){
            throw new LengthCheckException("The Password Is too Short");
        }
        if (!(password.contains("@"))){
            throw new CharCheckException("Passowrd not Contains '@' in it ");
        }
        if (year<2005){
            throw new YearCheckThrowable("Year is Not GEN-Z");
        }
    }
}
