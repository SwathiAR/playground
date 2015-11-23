package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;

/**
 * Created by swathi on 9/16/2015.
 */
public class ReversingLLInPairs {

    public SinglyLinkedListNode reverseLLInPairs(SinglyLinkedListNode headNode) {

        SinglyLinkedListNode current = headNode;
        SinglyLinkedListNode newHead = headNode.getNext();

        SinglyLinkedListNode next;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode nextToNext;

        while (current != null && current.getNext() != null) {
            next = current.getNext();
            nextToNext = current.getNext().getNext();


            next.setNext(current);
            current.setNext(nextToNext);
            if (prev != null) {
                prev.setNext(next);
            }
            prev=current;
            current = nextToNext;

        }
        return newHead;

    }

}
