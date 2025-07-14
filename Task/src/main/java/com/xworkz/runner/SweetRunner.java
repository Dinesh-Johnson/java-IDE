package com.xworkz.runner;

import dto.SweetsDTO;

import java.util.*;

public class SweetRunner {
    public static void main(String[] args) {

        Set<SweetsDTO> sweetSet = new HashSet<>();

        sweetSet.add(new SweetsDTO("Mysore Pak", 50.0, new String[]{"Besan", "Ghee", "Sugar", "Cardamom", "Milk"}, 5, "Box"));
        sweetSet.add(new SweetsDTO("Rava Kesari", 40.0, new String[]{"Rava", "Sugar", "Ghee", "Cashew", "Saffron"}, 4, "Pack"));
        sweetSet.add(new SweetsDTO("Kaju Katli", 70.0, new String[]{"Cashew", "Sugar", "Cardamom", "Ghee", "Silver Leaf"}, 6, "Box"));
        sweetSet.add(new SweetsDTO("Boondi Laddu", 45.0, new String[]{"Boondi", "Sugar", "Ghee", "Raisin", "Cardamom"}, 10, "Pack"));
        sweetSet.add(new SweetsDTO("Coconut Burfi", 38.0, new String[]{"Coconut", "Milk", "Sugar", "Cardamom", "Ghee"}, 8, "Tray"));
        sweetSet.add(new SweetsDTO("Milk Peda", 55.0, new String[]{"Milk", "Sugar", "Cardamom", "Ghee", "Kesar"}, 4, "Pack"));
        sweetSet.add(new SweetsDTO("Badusha", 60.0, new String[]{"Maida", "Sugar", "Ghee", "Curd", "Baking Soda"}, 3, "Box"));
        sweetSet.add(new SweetsDTO("Sooji Halwa", 35.0, new String[]{"Sooji", "Sugar", "Milk", "Ghee", "Almond"}, 4, "Pack"));
        sweetSet.add(new SweetsDTO("Dry Fruit Laddu", 75.0, new String[]{"Dates", "Almond", "Cashew", "Fig", "Ghee"}, 5, "Box"));
        sweetSet.add(new SweetsDTO("Palkova", 68.0, new String[]{"Milk", "Sugar", "Ghee", "Cardamom", "Butter"}, 2, "Tray"));

        sweetSet.add(new SweetsDTO("Ellu Urundai", 30.0, new String[]{"Sesame", "Jaggery", "Cardamom", "Coconut", "Ghee"}, 6, "Pouch"));
        sweetSet.add(new SweetsDTO("Adhirasam", 50.0, new String[]{"Rice Flour", "Jaggery", "Ghee", "Cardamom", "Oil"}, 5, "Box"));
        sweetSet.add(new SweetsDTO("Kalkandu Pongal", 58.0, new String[]{"Rice", "Sugar Candy", "Milk", "Ghee", "Cashew"}, 4, "Tray"));
        sweetSet.add(new SweetsDTO("Rava Laddu", 42.0, new String[]{"Rava", "Sugar", "Milk", "Ghee", "Raisin"}, 6, "Box"));
        sweetSet.add(new SweetsDTO("Kesari Bath", 46.0, new String[]{"Sooji", "Sugar", "Saffron", "Cashew", "Ghee"}, 5, "Tray"));
        sweetSet.add(new SweetsDTO("Jackfruit Halwa", 65.0, new String[]{"Jackfruit", "Jaggery", "Ghee", "Cashew", "Coconut"}, 3, "Tray"));
        sweetSet.add(new SweetsDTO("Beetroot Halwa", 48.0, new String[]{"Beetroot", "Sugar", "Milk", "Ghee", "Cardamom"}, 4, "Tray"));
        sweetSet.add(new SweetsDTO("Carrot Halwa", 52.0, new String[]{"Carrot", "Milk", "Ghee", "Sugar", "Kesar"}, 3, "Box"));
        sweetSet.add(new SweetsDTO("Rice Payasam", 50.0, new String[]{"Rice", "Milk", "Jaggery", "Ghee", "Cardamom"}, 5, "Cup"));
        sweetSet.add(new SweetsDTO("Moong Dal Payasam", 53.0, new String[]{"Moong Dal", "Jaggery", "Coconut Milk", "Cardamom", "Ghee"}, 4, "Cup"));

        sweetSet.add(new SweetsDTO("Aval Kesari", 44.0, new String[]{"Aval", "Sugar", "Ghee", "Cashew", "Milk"}, 3, "Pack"));
        sweetSet.add(new SweetsDTO("Wheat Halwa", 60.0, new String[]{"Wheat Flour", "Sugar", "Ghee", "Cashew", "Cardamom"}, 5, "Box"));
        sweetSet.add(new SweetsDTO("Pineapple Kesari", 47.0, new String[]{"Rava", "Pineapple", "Sugar", "Ghee", "Cashew"}, 4, "Tray"));
        sweetSet.add(new SweetsDTO("Banana Halwa", 55.0, new String[]{"Banana", "Jaggery", "Ghee", "Cashew", "Rice Flour"}, 3, "Box"));
        sweetSet.add(new SweetsDTO("Paasi Paruppu Laddu", 39.0, new String[]{"Green Gram", "Sugar", "Ghee", "Cardamom", "Almond"}, 5, "Pack"));
        sweetSet.add(new SweetsDTO("Ulundhu Laddu", 41.0, new String[]{"Urad Dal", "Jaggery", "Ghee", "Coconut", "Cardamom"}, 4, "Pack"));
        sweetSet.add(new SweetsDTO("Black Halwa", 80.0, new String[]{"Rice", "Jaggery", "Coconut Milk", "Ghee", "Nutmeg"}, 2, "Box"));
        sweetSet.add(new SweetsDTO("Kamarcut", 33.0, new String[]{"Jaggery", "Coconut", "Cardamom", "Ghee", "Rice Flour"}, 4, "Tray"));
        sweetSet.add(new SweetsDTO("Kova Urundai", 59.0, new String[]{"Khoya", "Sugar", "Cardamom", "Cashew", "Milk"}, 3, "Pack"));
        sweetSet.add(new SweetsDTO("Thengai Burfi", 36.0, new String[]{"Coconut", "Sugar", "Milk", "Ghee", "Cardamom"}, 6, "Box"));



        Set<SweetsDTO> priceSort = new TreeSet<>((s1, s2) -> Double.compare(s2.getPrice(), s1.getPrice()));
        priceSort.addAll(sweetSet);
        priceSort.forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------------------------------------");

        List<SweetsDTO> list =new ArrayList<>(sweetSet);

        list.stream()
                .sorted(Comparator.comparing(SweetsDTO::getName, Comparator.reverseOrder())
                                .thenComparing(Comparator.comparingDouble(SweetsDTO::getPrice).reversed()))
                .forEach(System.out::println);

//        list.stream().sorted((s1,s2)->{
//            int nameCompare = s2.getName().compareTo(s1.getName());
//            if (nameCompare!=0)
//                return nameCompare;
//            return Double.compare(s2.getPrice(), s1.getPrice());
//        }).forEach(System.out::println);

        System.out.println("----------------------  --------------------------------------------------------------------------------");


        List<SweetsDTO> linkedList = new LinkedList<>(sweetSet);

        linkedList.forEach(System.out::println);


    }
}
