/**
 * Created by saim on 19/04/16.
 */
public class MyLinkedList{
    private Node first;

    public void addFirst(String buchstabe){
        Node n = new Node(buchstabe);
        if (first == null){
            first = n;
        } else {
            n.setNext(first);
            first = n;
        }
    }

    public void addLast(String buchstabe){
        Node n = new Node(buchstabe);
        getLast().setNext(n);
    }

    public Node getFirst(){
        return first;
    }

    public Node getLast(){
        Node n = first;

        while (n.getNext() != null){
            n = n.getNext();
        }
        return n;
    }



}
