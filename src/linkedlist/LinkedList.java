package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private Integer length;

    class Node {
        Integer value;
        Node next;

        public Node (Integer value){
            value = value;
            next = null;
        }
    }

    public LinkedList(Integer value){
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        length = 1;
    }

    public void printList(){

        if (length == 0){
            return;
        }else if (length == 1) {
            System.err.println(this.head.value);
        }else {
            int iteration = 0;
            Node printer = head;
            while (iteration < length){
                System.err.println(printer.value);
                printer = printer.next;
                iteration ++;
            }
        }

    }

    public void appendFirst(Integer value){
        Node appendNode = new Node (value);

        if (this.length == 1){
            head = appendNode;
            head.next = null;
        }else {
            Node nextOfHead = head.next;
            head = appendNode;
            head.next = nextOfHead;
        }

        length ++;

    }


}
