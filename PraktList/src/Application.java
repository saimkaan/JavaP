/**
 * Created by saim on 19/04/16.
 */
//public class Application {
//    public static void main(String[] args) {
//
//        // Neue Liste erzeugen
//        MyLinkedList themen = new MyLinkedList();
//
//        // Fuegt drei Themen der Liste hinzu
//        themen.addFirst("B");
//        themen.addLast("A");
//
//        // Loescht ein Thema wieder
//        themen.deleteLast("A");
//
//    }
//}
import java.util.LinkedList;

class Application {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");

        System.out.println("Original contents of ll: " + ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("Contents of ll after deletion: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after deleting first and last: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " Changed");

        System.out.println("ll after change: " + ll);
    }
}