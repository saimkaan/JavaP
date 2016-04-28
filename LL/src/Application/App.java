package Application;

import list.MyLinkedList;

/**
 * Created by saim on 28/04/16.
 */
public class App {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.insertFirst(12);
        ll.insertLast(21);

        ll.insertSorted(1);
        ll.insertSorted(2);
        ll.insertSorted(34);



        ll.printAll();
    }




}
