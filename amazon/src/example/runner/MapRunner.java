package example.runner;

import java.util.*;

public class MapRunner {
    public static void main(String[] args) {

        Map<String,String> map =new LinkedHashMap<>();
        //put()
        map.put("Schindler's List", "Liam Neeson");
        map.put("Pulp Fiction", "Samuel L Jackson");
        map.put("Forrest Gump", "Tom Hanks");
        map.put("Shutter Island", "Leonardo Dicaprio");
        map.put("Fight Club", "Edward Norton");
        map.put("The Dark Knight", "Christian Bale");
        map.put("Inception", "Leonardo Dicaprio");
        map.put("The Matrix", "Keanu Reeves");
        map.put("Titanic", "Leonardo Dicaprio");
        map.put("The Godfather", "Marlon Brando");
        map.put("The Wolf of Wall Street", "Leonardo Dicaprio");
        map.put("Avengers: Endgame", "Robert Downey Jr.");
        map.put("Iron Man", "Robert Downey Jr.");
        map.put("Gladiator", "Russell Crowe");
        map.put("The Revenant", "Leonardo Dicaprio");
        map.put("John Wick", "Keanu Reeves");
        map.put("Pirates of the Caribbean", "Johnny Depp");
        map.put("The Pursuit of Happyness", "Will Smith");
        map.put("Interstellar", "Matthew McConaughey");
        map.put("Black Panther", "Chadwick Boseman");
        map.put("The Shawshank Redemption", "Tim Robbins");
        map.put("Joker", "Joaquin Phoenix");
        map.put("The Social Network", "Jesse Eisenberg");
        map.put("Deadpool", "Ryan Reynolds");
        map.put("Mission: Impossible – Fallout", "Tom Cruise");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();


        //entrySet.forEach(e-> System.out.println("Movie(KEY) :"+e.getKey()+" "+" Actor(VALUE) :"+e.getValue()));

        // size()
        System.out.println("Size: " + map.size());
        System.out.println();

        // get()
        System.out.println("Get 'Forrest Gump': " + map.get("Forrest Gump"));
        System.out.println();

        // containsKey()
        System.out.println("Contains key 'Fight Club'? " + map.containsKey("Fight Club"));
        System.out.println();

        // containsValue()
        System.out.println("Contains value 'Tom Hanks'? " + map.containsValue("Tom Hanks"));
        System.out.println();

        // keySet()
        System.out.println("All Keys:");
        Set<String> keys = map.keySet();
        keys.forEach(System.out::println);
        System.out.println();


        // values()
        System.out.println();
        System.out.println("All Values:");
        Collection<String> values = map.values();
        values.forEach(System.out::println);
        System.out.println();


        // entrySet()
        System.out.println("All Entries:");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.forEach(System.out::println);
        System.out.println();


        // putIfAbsent()
        map.putIfAbsent("The Revenant", "Leonardo Dicaprio");
        System.out.println("After putIfAbsent:");
        System.out.println(map);

        // replace()
        map.replace("Pulp Fiction", "John Travolta");
        System.out.println("After replace:");
        System.out.println(map);
        System.out.println();


        // remove()
        map.remove("Shutter Island");
        System.out.println("After remove:");
        System.out.println(map);
        System.out.println();


        // isEmpty()
        System.out.println();
        System.out.println("Is map empty? " + map.isEmpty());
        System.out.println();


        // clear()
        map.clear();
        System.out.println();
        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());

        System.out.println("Is map empty? " + map.isEmpty());


    }
}
