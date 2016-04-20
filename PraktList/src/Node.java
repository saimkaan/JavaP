/**
 * Created by saim on 19/04/16.
 */
public class Node {

    private String buchstabe;
    private Node next;

    public Node(String buchstabe){
        this.buchstabe = buchstabe;
    }

    public String getBuchstabe() {
        return buchstabe;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
