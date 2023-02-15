package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String>q = new ArrayDeque<>();
        q.add("A");
        q.add("B");
        q.add("C");
        System.out.println(q);
        q.offer("D");
        var front = q.remove();
        System.out.println(front);
        front = q.poll();
        System.out.println(front);

    }
}
