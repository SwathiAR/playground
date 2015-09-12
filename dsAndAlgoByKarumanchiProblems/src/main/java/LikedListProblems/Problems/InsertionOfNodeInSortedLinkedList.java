package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;

/**
 * Created by swathi on 9/11/2015.
 */
public class InsertionOfNodeInSortedLinkedList {
    public SinglyLinkedListNode insertNode(SinglyLinkedListNode headNode , SinglyLinkedListNode nodeToInsert){
        if(headNode == null){
            return nodeToInsert;
        }
        if(headNode.getData().compareTo(nodeToInsert.getData()) >=0){
            nodeToInsert.setNext(headNode);
            headNode = nodeToInsert;
            return headNode;
        }
        SinglyLinkedListNode temp = headNode;
        while (temp.getNext() != null && temp.getNext().getData().compareTo(nodeToInsert.getData()) < 0 ){
            temp = temp.getNext();
        }
        SinglyLinkedListNode next = temp.getNext();
        temp.setNext(nodeToInsert);
        nodeToInsert.setNext(next);
        return headNode;
    }
}
