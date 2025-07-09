package example.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MapArrayRunner {

    public static void main(String[] args) {

        Map<String,String[]> map =new HashMap<>();

        map.put("Windows",new String[]{"8","8.1","10","11"});
        map.put("Android",new String[]{"11","12","13","14"});
        map.put("IOS",new String[]{"13","14","15","16"});

        map.keySet().forEach(System.out::println);
        map.values().stream().forEach(e-> System.out.println(Arrays.asList(e)));


    }
}
