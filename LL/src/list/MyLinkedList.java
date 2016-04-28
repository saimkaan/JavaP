package list;

/**
 * Created by saim on 28/04/16.
 */
public class MyLinkedList {
    private Node first, last;
    private int size;

    private Node createNode(int value){
        Node neu = new Node();
        neu.setValue(value);
        return neu;
    }

    public int getSize(){
        return size;
    }

    public void insertLast(int value){
        Node neu = createNode(value);
        if (first == null){
            first = neu;
            last = neu;
        } else {
            last.setNext(neu);
            last = neu;
        }
        size++;
    }

    public void insertFirst(int value){
        Node neu = createNode(value);
        if (first == null){
            first = neu;
            last = neu;
        } else{
            neu.setNext(first);
            first = neu;
        }
        size++;
    }

    public void insertSorted(int value){
        size++;
        Node neu = createNode(value);

        if (first == null){
            first = neu;
            last =neu;
        } else if (first.getValue() > value){
            neu.setNext(first);
            first = neu;
        } else{
            Node tmp = first;
            while (tmp.next != null){
                if (tmp.getNext().getValue() <value){
                    tmp = tmp.getNext();
                } else {
                    neu.setNext(tmp.getNext());
                    tmp.setNext(neu);
                    return;
                }
            }
            tmp.setNext(neu);
            last = neu;
        }
    }

    public void remove(int value) {
        if (first == null) return;


        Node tmp = first;
        Node prev = first;
        while (tmp != null) {
            if (tmp.getValue() == value) {
                Node curr = tmp.getNext();
                tmp = prev;
                tmp.setNext(curr);
                size--;
                break;
            }
        }
        prev = tmp;
        tmp = tmp.getNext();
    }

    public void printAll(){
        if (first == null) return;
        Node tmp = first;

        while (tmp !=null) {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();

        }
        System.out.println();
    }
}
