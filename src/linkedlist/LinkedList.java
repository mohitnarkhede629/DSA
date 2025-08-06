package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private Integer length;

    class Node {
        Integer value;
        Node next;

        public Node (Integer value){
            this.value = value;
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
            Node temp = head;
            while (temp != null){
                System.err.println(temp.value);
                temp = temp.next;
            }

        }

    }

    public void appendFirst(Integer value){
        Node newNode = new Node (value);

        if (length == 1){
            Node temp = head;
            head = newNode;
            newNode.next = temp;
            tail = newNode.next;
            tail.next = null;
        }

        length ++;


    }

    public Integer size(){
        return  this.length;
    }


}
