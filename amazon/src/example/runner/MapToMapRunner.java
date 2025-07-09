package example.runner;

import java.util.HashMap;
import java.util.Map;

public class MapToMapRunner {

    public static void main(String[] args) {

        Map<String,Map<String,String>> map = new HashMap<>();

        Map<String,String> map1 = new HashMap<>();
        map1.put("OS","Windows 11");
        map1.put("Processor","Intel i7");
        map1.put("Storage","1028 GB");
        map1.put("RAM","16 GB");
        map1.put("Graphics","4060");


        Map<String,String> map2= new HashMap<>();
        map2.put("OS","Windows 11");
        map2.put("Processor","AMD R9");
        map2.put("Storage","2TB");
        map2.put("RAM","32 GB");
        map2.put("Graphics","5060");

        map.put("Entry No 1001",map1);
        map.put("Entry No 1002",map2);

        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);



    }
}
