package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;
import LikedListProblems.SinglyLinkedList;

import java.util.Hashtable;

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
            return null;
        }
        if (count == n - 1) {
            return headNode;
        }

        if (count > n - 1) {
            return findNthNodeFromEnd(n, headNode.getNext());
        }
        return headNode;

    }

    //Using Hash Map
    public  SinglyLinkedListNode findnthNodeUsingHashTable(int n , SinglyLinkedListNode headNode){

        SinglyLinkedListNode temp = headNode;
        Hashtable<Integer , SinglyLinkedListNode> table = new Hashtable<Integer, SinglyLinkedListNode>();
        int count=0;

        while(temp.getNext()!=null){
            table.put(count++, temp);
            temp  = temp.getNext();
        }
        return table.get(count-n+1);

    }





}
