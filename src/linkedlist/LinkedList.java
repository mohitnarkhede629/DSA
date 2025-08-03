package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private Integer length;

    class Node {
        Integer value;
        Node Next;
    }

    public LinkedList(Integer value){
        Node node = new Node();
        node.value = value;
        this.head = node;
        this.tail = node;
        length = 1;
    }

    public void printList(){

        if (length == 0){
            return;
        }else if (length == 1) {
            System.err.println(this.head.value);
        }

    }


}
