import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        System.out.println("Linked List App");


        long startTimeJava = System.nanoTime();

        LinkedList<Integer> linkedListJava = new LinkedList<>();

        linkedListJava.addFirst(1);
        linkedListJava.addLast(2);
        linkedListJava.removeLast();
        linkedListJava.addFirst(3);
        linkedListJava.removeFirst();
        linkedListJava.addLast(4);
        linkedListJava.addFirst(5);
        linkedListJava.addFirst(1);
        linkedListJava.addLast(2);
        linkedListJava.removeFirst();
        linkedListJava.addFirst(3);
        linkedListJava.addLast(4);
        linkedListJava.removeLast();
        linkedListJava.addFirst(5);

        long estimatedTimeJava = System.nanoTime() - startTimeJava;


        long startTimeOlaf = System.nanoTime();

        LinkedListOlaf<Integer> linkedListOlaf = new LinkedListOlaf<>();

        linkedListOlaf.addFirst(1);
        linkedListOlaf.addLast(2);
        linkedListOlaf.removeLast();
        linkedListOlaf.addFirst(3);
        linkedListOlaf.removeFirst();
        linkedListOlaf.addLast(4);
        linkedListOlaf.addFirst(5);
        linkedListOlaf.addFirst(1);
        linkedListOlaf.addLast(2);
        linkedListOlaf.removeFirst();
        linkedListOlaf.addFirst(3);
        linkedListOlaf.addLast(4);
        linkedListOlaf.removeLast();
        linkedListOlaf.addFirst(5);

        long estimatedTimeOlaf = System.nanoTime() - startTimeOlaf;


        System.out.println(linkedListJava);
        System.out.println(linkedListOlaf);

        System.out.println("Duration: " + estimatedTimeJava + " vs. " + estimatedTimeOlaf);
    }
}