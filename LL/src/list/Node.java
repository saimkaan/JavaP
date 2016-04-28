package list;

/**
 * Created by saim on 28/04/16.
 */
public class Node {
    public int value;
    public Node next;



    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {

        return next;
    }
}
