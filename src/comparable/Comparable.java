package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void show(){
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("A"));
        customers.add(new Customer("B"));
        customers.add(new Customer("C"));

        Collections.sort(customers);


    }
}
