package com.xworkz.runner;

import com.xworkz.exception.AgeCheckException;
import com.xworkz.exception.NamesCheckException;
import com.xworkz.practice.Person;

public class PersonRunner {
    public static void main(String[] args) throws NamesCheckException, AgeCheckException {

        Person person=new Person();
        person.setName("Di");
        person.setAge(17);

        if(person.getName().length()<3){

            throw new NamesCheckException("Name is Invalid");
        }
        if (person.getAge()>=18){

            throw new AgeCheckException("You are Not of the right age To vote");
        }
    }
}
