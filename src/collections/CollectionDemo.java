package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");
        collection.add("d");
        var containsD = collection.contains("d");
        System.out.println(containsD);

        var objectArray = collection.toArray();
        var stringArray = collection.toArray(new String[0]);

        Collection<String>other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(other == collection);
        System.out.println(other.equals(collection));


    }
}
