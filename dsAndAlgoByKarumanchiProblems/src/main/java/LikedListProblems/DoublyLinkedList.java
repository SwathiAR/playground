package LikedListProblems;

/**
 * Created by swathi on 9/3/2015.
 */
public class DoublyLinkedList extends LinkedListOperation {

    private DLLNode head;
    private DLLNode tail;
    private int length;


    public int getLength(DLLNode headNode) {
        length = 0;
        DLLNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    public  DoublyLinkedList(){

    }

    public DLLNode insertNode(Object data , int position){
        if( head == null){
            head = new DLLNode(data);
            tail = head;
            return head;

        }

        if(position ==1){
            DLLNode nodeToInsert = new DLLNode(data);
            nodeToInsert.setNext(head);
            head.setPrevious(nodeToInsert);
            head = nodeToInsert;
            return head;
        }

        else {
            DLLNode nodeToInsert = new DLLNode(data);
            DLLNode previousNode = getPreviousNode(head, position);
            if (previousNode != null) {
                DLLNode currentNode = previousNode.getNext();
                nodeToInsert.setNext(currentNode);
                nodeToInsert.setPrevious(previousNode);
                if (currentNode != null) {
                    currentNode.setPrevious(nodeToInsert);
                }
                previousNode.setNext(nodeToInsert);

            }
        }
        return head;
    }

    private DLLNode getPreviousNode(DLLNode headNode , int position) {
        int length = getLength(headNode);
        if (position < 0 || position > length + 1) {
            System.out.println("Invalid position");
            return null;

        }

            int count = 1;
            DLLNode previousNode = headNode;
            while (count < position - 1) {
                count++;
                previousNode = previousNode.getNext();

            }

            return previousNode;


    }



    public DLLNode deleteNode(int position){
        if(position == 0 || position > getLength(head)){
            System.out.println("Invalid position");
        }

        if(position == 1){
            DLLNode temp = head.getNext();
            head = null;
            temp.setPrevious(head);
            head = temp;
            return temp;
        }

        else {

            DLLNode previousNode = getPreviousNode(head ,position);
            if(previousNode != null) {
                DLLNode currentNode = previousNode.getNext();
                previousNode.setNext(currentNode.getNext());
                if (currentNode.getNext() != null) {
                    (currentNode.getNext()).setPrevious(previousNode);
                }
            }
        }
        return head;

    }




}
