package set;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> s1 = new HashSet<>();

        s1.add("sky");
        s1.add("is");
        s1.add("blue");
        s1.add("blue");

        System.out.println(s1);
        Collection<String>collections = new ArrayList<>();
        Collections.addAll(collections,"A","A","B","C");
        System.out.println(collections);

        Set<String>s2 = new HashSet<>();
        s2.addAll(collections);
        System.out.println(s2);

        Set<String> set1 = new HashSet<>(Arrays.asList("B","C","D"));
        Set<String> set2 = new HashSet<>(Arrays.asList("A","C","D"));

        //Union
          set1.addAll(set2);
        System.out.println(set1);

        //Intersection
        System.out.println(set1.retainAll(set2));

        //Difference
        System.out.println(set1.removeAll(set2));


    }
}
