package example.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class ListRunner {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(55);
        list.add(8);
        list.add(3);
        list.add(68);
        list.add(38);
        list.add(85);

        Spliterator<Integer> integerSpliterator= list.spliterator();
        Spliterator<Integer> integerSpliterator1= integerSpliterator.trySplit();

        System.out.println("First Half :");
        integerSpliterator1.forEachRemaining(System.out::println);

        System.out.println("Second Half :");
        integerSpliterator.forEachRemaining(System.out::println);

        System.out.println("From index 3 to 7 :");
        System.out.println(list.subList(3,7));

    }
}
