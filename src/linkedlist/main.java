package linkedlist;

public class main {

    public static void main (String [] args){

        LinkedList linkedList = new LinkedList(3);
        linkedList.appendFirst(10);
        linkedList.appendFirst(14);
        System.err.println("Size : " + linkedList.size());
        linkedList.printList();



    }
}
