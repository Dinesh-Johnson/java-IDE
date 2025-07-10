package example.runner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {

        Map<String,String> map =new HashMap<>();
        map.put("Schindler's List","Liam Neeson");
        map.put("Pulp Fiction","Samuel L Jackson ");
        map.put("Forrest Gump","Tom Hanks");
        map.put("Shutter Island","Leonardo Dicaprio");
        map.put("Fight Club","Edward Norton");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();

        entrySet.forEach(e-> System.out.println("Movie(KEY) :"+e.getKey()+" "+" Actor(VALUE) :"+e.getValue()));


        System.out.println("Size: " + map.size());

        System.out.println("Get key 2: " + map.get(2));

        System.out.println("Contains key 3? " + map.containsKey(3));

        System.out.println("Contains value 'Pulp Fiction'? " + map.containsValue("Pulp Fiction"));

        System.out.println("All Keys:");
        for (String k : map.keySet()) {
            System.out.println(k);
        }

        System.out.println("All Values:");
        for (String v : map.values()) {
            System.out.println(v);
        }

        System.out.println("All Entries:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        map.remove(2);
        System.out.println("After removing key 2: " + map);

        System.out.println("Is map empty? " + map.isEmpty());

        map.putIfAbsent("Forrest Gump","Tom Hanks");
        map.putIfAbsent("Shutter Island","Leonardo Dicaprio");
        System.out.println("After putIfAbsent: " + map);


        map.replace("Schindler's List", "Ben Kingsley");
        System.out.println("After replace: " + map);

        map.clear();
        System.out.println("After clear, size: " + map.size());


    }
}
