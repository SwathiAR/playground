package LikedListProblems;

/**
 * Created by swathi on 9/8/2015.
 */
public class CircularLinkedList<T extends Comparable> {

    private SinglyLinkedListNode head;
    private int length = 0;

    public CircularLinkedList() {
    }

    public int listLength(SinglyLinkedListNode head) {

        if (head == null) {
            return length;
        } else {
            length = 1;
            while (head.getNext() != head) {
                length++;
                head = head.getNext();

            }
        }
        return length;
    }

    public SinglyLinkedListNode addToTheTail(T data) {

        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (head == null) {
            node.setNext(node);
            head = node;
            return node;
        }


        SinglyLinkedListNode current = head.getNext();
        while (current.getNext() != head) {
            current = current.getNext();
        }
        current.setNext(node);
        node.setNext(head);
        return head;

    }

    public SinglyLinkedListNode addToTheHead(T data) {
        head = addToTheTail(data);
        return head;

    }

    public SinglyLinkedListNode addInTheMiddle(T data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        int length = listLength(head);
        if (position < 0 || position > length + 1) {
            System.out.println("Invalid position");
            return null;
        } else {
            SinglyLinkedListNode previousNodeNode = getPreviousNode(position);
            SinglyLinkedListNode currentNode = previousNodeNode.getNext();
            node.setNext(currentNode);
            previousNodeNode.setNext(node);
        }
        return head;
    }

    private SinglyLinkedListNode getPreviousNode(int position) {
        int count = 1;
        SinglyLinkedListNode previousNode = head.getNext();
        while (count < position - 1) {
            count++;
            previousNode = previousNode.getNext();
        }
        return previousNode;
    }


    public SinglyLinkedListNode deleteFromHead() {
        SinglyLinkedListNode current = head.getNext();
        while (current.getNext() != head) {
            current = current.getNext();
        }
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode tail = current;
        tail.setNext(head.getNext());
        head.setNext(null);
        return temp;
    }

public SinglyLinkedListNode deleteFromTail() {
    SinglyLinkedListNode current = head.getNext();
    while (current.getNext().getNext() != head) {
        current = current.getNext();
    }
    SinglyLinkedListNode previousOfTail = current;

previousOfTail.setNext(head);
    SinglyLinkedListNode tail = current.getNext();
    SinglyLinkedListNode temp = tail;
    tail.setNext(null);
    return temp;



}
}


