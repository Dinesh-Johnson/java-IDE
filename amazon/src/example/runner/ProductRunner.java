package example.runner;


import example.dto.product.Product;
import example.dto.product.Vendor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductRunner {
    public static void main(String[] args) {

        Map<Product, Vendor> map= new HashMap<>();

        map.put(new Product("Laptop", "Electronics", 55000, "L123", 1), new Vendor("Lenovo", "GST123", "2010"));
        map.put(new Product("Phone", "Electronics", 20000, "P456", 2), new Vendor("Samsung", "GST456", "2005"));
        map.put(new Product("Tablet", "Electronics", 18000, "T789", 3), new Vendor("Apple", "GST789", "2001"));
        map.put(new Product("Smartwatch", "Wearable", 7000, "S001", 4), new Vendor("Noise", "GST001", "2017"));
        map.put(new Product("Smart TV", "Electronics", 35000, "TV321", 5), new Vendor("Sony", "GST321", "1995"));
        map.put(new Product("Bluetooth Speaker", "Audio", 4500, "BS555", 6), new Vendor("boAt", "GST555", "2016"));
        map.put(new Product("Monitor", "Peripherals", 12000, "M876", 7), new Vendor("LG", "GST876", "1999"));
        map.put(new Product("Keyboard", "Accessories", 1200, "K111", 8), new Vendor("Logitech", "GST111", "1981"));
        map.put(new Product("Mouse", "Accessories", 800, "M222", 9), new Vendor("HP", "GST222", "2003"));
        map.put(new Product("Router", "Networking", 2500, "R333", 10), new Vendor("TP-Link", "GST333", "2008"));
        map.put(new Product("Printer", "Peripherals", 9500, "P444", 11), new Vendor("Canon", "GST444", "2002"));
        map.put(new Product("Scanner", "Peripherals", 8400, "S555", 12), new Vendor("Epson", "GST555", "1998"));
        map.put(new Product("Graphics Card", "Hardware", 32000, "G666", 13), new Vendor("NVIDIA", "GST666", "1993"));
        map.put(new Product("RAM", "Hardware", 4500, "R777", 14), new Vendor("Corsair", "GST777", "2007"));
        map.put(new Product("SSD", "Storage", 6000, "S888", 15), new Vendor("Western Digital", "GST888", "1970"));
        map.put(new Product("HDD", "Storage", 4000, "H999", 16), new Vendor("Seagate", "GST999", "1982"));
        map.put(new Product("Webcam", "Accessories", 1600, "W101", 17), new Vendor("Zebronics", "GST101", "2012"));
        map.put(new Product("Microphone", "Audio", 2100, "M202", 18), new Vendor("Blue", "GST202", "2006"));
        map.put(new Product("Power Bank", "Mobile", 1300, "PB303", 19), new Vendor("Mi", "GST303", "2013"));
        map.put(new Product("VR Headset", "Gaming", 19000, "VR404", 20), new Vendor("Meta", "GST404", "2016"));
        map.put(new Product("Drone", "Gadgets", 45000, "D505", 21), new Vendor("DJI", "GST505", "2011"));
        map.put(new Product("Smart Light", "Home Automation", 2500, "SL606", 22), new Vendor("Syska", "GST606", "2015"));
        map.put(new Product("Air Purifier", "Home Appliance", 8500, "AP707", 23), new Vendor("Philips", "GST707", "1990"));
        map.put(new Product("Projector", "Office Equipment", 29000, "PR808", 24), new Vendor("BenQ", "GST808", "2000"));
        map.put(new Product("Gaming Console", "Gaming", 40000, "GC909", 25), new Vendor("Sony PlayStation", "GST909", "1994"));

//        map.keySet().forEach(System.out::println);
//        map.values().forEach(System.out::println);

        Set<Map.Entry<Product,Vendor>> entrySet= map.entrySet();
        entrySet.forEach(System.out::println);

    }
}
