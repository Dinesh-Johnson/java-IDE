package example.runner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {

        Map<String,String> map =new HashMap<>();
        map.put("Schindler's List","Liam Neesson");
        map.put("Pulp Fiction","Samuel L Jackson ");
        map.put("Forrest Gump","Tom Hanks");
        map.put("Shutter Island","Leonardo Dicaprio");
        map.put("Fight Club","Edward Norton");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();

        entrySet.forEach(e-> System.out.println("Movie(KEY) :"+e.getKey()+" "+" Actor(VALUE) :"+e.getValue()));
    }
}
