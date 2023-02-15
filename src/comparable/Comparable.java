package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void show(){
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("A", "e3"));
        customers.add(new Customer("B", "e1"));
        customers.add(new Customer("C", "e2"));

        Collections.sort(customers);
        System.out.println(customers);

        Collections.sort(customers,new EmailComparator());

        System.out.println(customers);


    }
}
