package hashTables;

import comparable.Customer;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void show() {
        var c1 = new Customer("a","e1");
        var c2 = new Customer("b","e2");

        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(),c1);
        map.put(c2.getEmail(),c2);

        var c = map.get("e1");
        System.out.println(c);
        c = map.get("e0");
        System.out.println(c);
        c = map.getOrDefault("e0",new Customer("Unkown",""));
        System.out.println(c);

        for(var item : map.entrySet()){
            System.out.println(item.getValue());
            System.out.println(item.getKey());
        }

        for(var key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

        for(var customer : map.values()){
            System.out.println(customer);
        }
    }
}
