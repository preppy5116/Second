import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //Задание первое
        String[] array = {"London", "Moskow", "Paris", "Berlin", "London", "Stambul", "Moskow"};
        //Число уникальных элементов
        Set<String> set = new TreeSet<>();
        set.addAll(List.of(array));
        System.out.println("Число уникальных элементов = " + set.size());
        //Число повторов через map
        Map<String,Integer> map = new HashMap<>();
        for (String s : array) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }

        }
        System.out.println("Число повторов");
        System.out.println(map);
        //Второй вариант нахождения повторов
        System.out.println("Число повторов 2");
        for(String s : set)
        {
            System.out.print(s + " " + Collections.frequency(List.of(array),s) + "   ");
        }
        System.out.println();


        //Задание второе
        HashMap<String, Integer> phone = new HashMap<>();
        Phone book = new Phone();
        book.add( 52234,"Ann");
        book.add( 89241,"Mark");
        book.add(455457,"Den" );
        book.add(44135, "Ann");
        book.add(243243, "Den");

        System.out.println(book.get("Ann"));
        System.out.println(book.get("Mark"));


        }
    }
