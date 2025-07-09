package example.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapListRunner {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        map.put("Fruits", Arrays.asList("Apple","Mango","Banana"));
        map.put("Vegetables", Arrays.asList("Drum Stick","Pumpkin","Bitter guard"));
        map.put("Languages", Arrays.asList("C","C++","Java","Python"));

        map.keySet().forEach(System.out::println);
        map.values().stream().forEach(s-> System.out.println(s));
    }
}
