package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(0,"a!");
        System.out.println(list);
        list.set(0,"a+");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.indexOf("a"));
        list.add("a");
        list.add("d");
        System.out.println(list.lastIndexOf("a"));

        System.out.println(list.subList(1,3));

    }
}
