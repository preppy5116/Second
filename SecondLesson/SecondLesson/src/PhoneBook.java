import java.util.*;

public class PhoneBook {
     HashMap <String, Set<String>> phone = new HashMap<>();
    public void add( String name, String number) {
        if(!phone.containsKey(name))
        {
            phone.put(name, new HashSet<>());
        }
        phone.get(name).add(number);
    }
     public String get (String name) {
        return phone.get(name).toString();
    }

    public void print () {
        for(String item : phone.keySet()) {
            System.out.println(item + " " + phone.get(item));
        }
    }
}
