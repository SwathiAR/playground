/**
 * Created by swathi on 9/3/2015.
 */
public class LinkedListOperation {

    public int listLength(SinglyLinkedListNode headNode) {
        int length = 0;
        SinglyLinkedListNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }


    public int listLength(DLLNode headNode) {
        int length = 0;
        DLLNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }
}
