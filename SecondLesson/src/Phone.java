import java.util.*;

public class Phone {
     HashMap <Integer, String> phone = new HashMap<>();
    void add( int number, String name) {
        phone.put(number, name);
//        System.out.println(phone);
    }
    Set<String> get (String name) {
        Set<String> contact = new TreeSet<>();
        for(Integer key :phone.keySet()) {
            if(name.equals(phone.get(key))) {
                contact.add(phone.get(key)+ " - " + key);
            }
        }
        return contact;
    }
}
