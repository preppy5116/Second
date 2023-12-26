import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //Задание первое
        String[] array = {"London", "Moskow", "Paris", "Berlin", "London", "Stambul", "Moskow"};
        //Число уникальных элементов
        Set<String> set = new TreeSet<>(List.of(array));
        System.out.println(set);
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
        System.out.println("\nВторое задание");
        HashMap<String, Integer> phone = new HashMap<>();
        PhoneBook book = new PhoneBook();
        book.add("Ann", "52234");
        book.add( "Mark","89241");
        book.add("Den","455457" );
        book.add("Ann","44135");
        book.add( "Den","243243");

        System.out.println(book.get("Ann"));
        System.out.println(book.get("Mark"));

        book.print();



        }
    }
