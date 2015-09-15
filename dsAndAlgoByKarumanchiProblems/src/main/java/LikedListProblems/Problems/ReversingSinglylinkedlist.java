package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;

/**
 * Created by swathi on 9/12/2015.
 */
public class ReversingSinglylinkedlist {

    public  SinglyLinkedListNode reverseSinglyLinkedList(SinglyLinkedListNode headNode){

        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = headNode;
        SinglyLinkedListNode next;

        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        headNode = prev;
        return  headNode;

    }

    public SinglyLinkedListNode reverseByRecursion(SinglyLinkedListNode headNode) {

        if (headNode == null || headNode.getNext() == null) {
            return headNode;
        }

        SinglyLinkedListNode newHeadNode = reverseByRecursion(headNode.getNext());
        headNode.getNext().setNext(headNode);
        headNode.setNext(null);
        return newHeadNode;
    }
}
