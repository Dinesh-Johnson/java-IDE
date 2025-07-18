package com.xworkz.business;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@ComponentScan(basePackages = "com.xworkz.business")
public class Configuration {

    @Bean
    public String getString(){

        String s = new String();
        System.out.println("getString Created....");
        return s;
    }
    // 2. Object
    @Bean
    public Object getObject() {
        System.out.println("Object Bean Created");
        return new Object();
    }

    // 3. Wrapper Classes (8 types, 2 instances each)
    @Bean
    public Integer getInteger1() {
        Integer i = new Integer(10);
        System.out.println("getInteger1 Created....");
        return i;
    }

    @Bean
    public Integer getInteger2() {
        Integer i = new Integer(20);
        System.out.println("getInteger2 Created....");
        return i;
    }

    @Bean
    public Double getDouble1() {
        Double d = new Double(10.5);
        System.out.println("getDouble1 Created....");
        return d;
    }

    @Bean
    public Double getDouble2() {
        Double d = new Double(20.5);
        System.out.println("getDouble2 Created....");
        return d;
    }

    @Bean
    public Boolean getBoolean1() {
        Boolean b = new Boolean(true);
        System.out.println("getBoolean1 Created....");
        return b;
    }

    @Bean
    public Boolean getBoolean2() {
        Boolean b = new Boolean(false);
        System.out.println("getBoolean2 Created....");
        return b;
    }

    @Bean
    public Character getChar1() {
        Character c = new Character('A');
        System.out.println("getChar1 Created....");
        return c;
    }

    @Bean
    public Character getChar2() {
        Character c = new Character('Z');
        System.out.println("getChar2 Created....");
        return c;
    }

    @Bean
    public Byte getByte1() {
        Byte b = new Byte((byte) 1);
        System.out.println("getByte1 Created....");
        return b;
    }

    @Bean
    public Byte getByte2() {
        Byte b = new Byte((byte) 2);
        System.out.println("getByte2 Created....");
        return b;
    }

    @Bean
    public Short getShort1() {
        Short s = new Short((short) 100);
        System.out.println("getShort1 Created....");
        return s;
    }

    @Bean
    public Short getShort2() {
        Short s = new Short((short) 200);
        System.out.println("getShort2 Created....");
        return s;
    }

    @Bean
    public Long getLong1() {
        Long l = new Long(1000L);
        System.out.println("getLong1 Created....");
        return l;
    }

    @Bean
    public Long getLong2() {
        Long l = new Long(2000L);
        System.out.println("getLong2 Created....");
        return l;
    }

    @Bean
    public Float getFloat1() {
        Float f = new Float(1.5f);
        System.out.println("getFloat1 Created....");
        return f;
    }

    @Bean
    public Float getFloat2() {
        Float f = new Float(2.5f);
        System.out.println("getFloat2 Created....");
        return f;
    }

    // 4. Collections

    @Bean
    public ArrayList<String> getArrayList() {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("getArrayList Created....");
        return al;
    }

    @Bean
    public LinkedList<String> getLinkedList() {
        LinkedList<String> ll = new LinkedList<>();
        System.out.println("getLinkedList Created....");
        return ll;
    }

    @Bean
    public HashSet<String> getHashSet() {
        HashSet<String> hs = new HashSet<>();
        System.out.println("getHashSet Created....");
        return hs;
    }

    @Bean
    public LinkedHashSet<String> getLinkedHashSet() {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        System.out.println("getLinkedHashSet Created....");
        return lhs;
    }

    @Bean
    public TreeSet<String> getTreeSet() {
        TreeSet<String> ts = new TreeSet<>();
        System.out.println("getTreeSet Created....");
        return ts;
    }

    @Bean
    public HashMap<String, String> getHashMap() {
        HashMap<String, String> hm = new HashMap<>();
        System.out.println("getHashMap Created....");
        return hm;
    }

    @Bean
    public LinkedHashMap<String, String> getLinkedHashMap() {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        System.out.println("getLinkedHashMap Created....");
        return lhm;
    }

    @Bean
    public TreeMap<String, String> getTreeMap() {
        TreeMap<String, String> tm = new TreeMap<>();
        System.out.println("getTreeMap Created....");
        return tm;
    }

    @Bean
    public Properties getProperties() {
        Properties p = new Properties();
        System.out.println("getProperties Created....");
        return p;
    }

    @Bean
    public Hashtable<String, String> getHashtable() {
        Hashtable<String, String> ht = new Hashtable<>();
        System.out.println("getHashtable Created....");
        return ht;
    }

    // 5. Array of names
    @Bean
    public String[] getNamesArray() {
        String[] names = new String[] {"Dinesh", "Owshick", "Johnson", "Samuel", "Ohmkar"};
        System.out.println("getNamesArray Created....");
        return names;
    }


}
