package com.xworkz.amazon.runner;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionRunner {
    public static void main(String[] args) {

       List<String> list=new LinkedList<>();
      list.add("Dinesh");//0
        list.add("Sam");//1
        list.add("Krishnaveni");//3
        list.add(2,"Gayatri");
        list.add(1,"Omkar");
        list.add("Krishnaveni");//3
        list.add(null);//3
        list.add(null);//3
       list.forEach(System.out::println);

       String element4= list.get(4);
        System.out.println("element4"+element4);
    }
}
