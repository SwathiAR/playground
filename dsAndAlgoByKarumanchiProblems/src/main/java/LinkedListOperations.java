/**
 * Created by swathi on 9/1/2015.
 */
public class LinkedListOperations {
    public int listLength(SinglyLinkedListNode headNode) {
        int length = 0;
        SinglyLinkedListNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    public SinglyLinkedListNode insertInLinkedList(SinglyLinkedListNode headNode, SinglyLinkedListNode nodeToInsert, int position) {

        if (headNode == null) {
            return nodeToInsert;
        }


        if (position == 1) {
            nodeToInsert.setNext(headNode);
            return nodeToInsert;
        } else {
            SinglyLinkedListNode previousNode = getpreviousNode(headNode, position);

            SinglyLinkedListNode currentNode = previousNode.getNext();
            nodeToInsert.setNext(currentNode);
            previousNode.setNext(nodeToInsert);
        }
        return headNode;
    }

    public SinglyLinkedListNode deleteNodeFromLinkedList(SinglyLinkedListNode headNode, int position) {

        if (position == 1) {
            SinglyLinkedListNode currentNode = headNode.getNext();
            return currentNode;

        } else {

            SinglyLinkedListNode previousNode = getpreviousNode(headNode, position);

            SinglyLinkedListNode currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
        }
        return headNode;

    }

    private SinglyLinkedListNode getpreviousNode(SinglyLinkedListNode headNode, int position) {
        int length = listLength(headNode);
        if (position < 1 || position > length + 1) {
            System.out.println("invalid position");
        }
        int count = 1;
        SinglyLinkedListNode previousNode = headNode;

        while (count < position - 1) {
            previousNode = previousNode.getNext();
            count++;
        }
        return previousNode;
    }


}

