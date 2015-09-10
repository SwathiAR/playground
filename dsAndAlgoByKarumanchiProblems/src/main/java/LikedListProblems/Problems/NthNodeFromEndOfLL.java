package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;
import LikedListProblems.SinglyLinkedList;

/**
 * Created by swathi on 9/9/2015.
 */
public class NthNodeFromEndOfLL {

    //Using Brute Force Approach
    public SinglyLinkedListNode findNthNodeFromEnd(int n, SinglyLinkedListNode headNode) {
        SinglyLinkedListNode temp = headNode ;
        int count = 0;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            count++;
        }
        if (count < n - 1) {
            System.out.println("There are a fewer number of nodes in the list");
            return null;
        }
        if (count == n - 1) {
            System.out.println("Found node");
            return headNode;
        }

        if (count > n - 1) {
            System.out.println("There aare more nodes");
            findNthNodeFromEnd(n, headNode.getNext());
        }
        return headNode;

    }
}
