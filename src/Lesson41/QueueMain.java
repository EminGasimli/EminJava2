package Lesson41;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Ali");
        queue.add("Vali");
        queue.add("Aysel");
        queue.add("Murad");

        System.out.println("Queue: " + queue);

        System.out.println("element(): " + queue.element());

        System.out.println("peek(): " + queue.peek());

        System.out.println("poll(): " + queue.poll());

        System.out.println("Queue poll-dan sonra: " + queue);

        queue.offer("Huseyn");

        System.out.println("offer-dan sonra: " + queue);

        System.out.println("remove(): " + queue.remove());

        System.out.println("Queue remove-dan sonra: " + queue);

        System.out.println("size(): " + queue.size());

        System.out.println("isEmpty(): " + queue.isEmpty());

        System.out.println("Queue elementləri:");

        for (String name : queue) {
            System.out.println(name);
        }
    }
}