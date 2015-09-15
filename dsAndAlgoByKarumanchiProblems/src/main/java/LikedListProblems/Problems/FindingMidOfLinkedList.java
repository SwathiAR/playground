package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;

import java.util.Hashtable;

/**
 * Created by swathi on 9/15/2015.
 */
public class FindingMidOfLinkedList {

   //Using Length
    public SinglyLinkedListNode findMidOfLinkedList(SinglyLinkedListNode headNode){
        SinglyLinkedListNode temp = headNode;
        int length=0;
        while(temp!=null){
            temp = temp.getNext();
            length++;
        }

        int mid = length/2;

        int count = 1;
        while(count<mid){
            headNode = headNode.getNext();
            count++;
        }
        return headNode;





    }

    //Using Hash Table
    public SinglyLinkedListNode findMidOfLLUsingHashTable(SinglyLinkedListNode  headNode){

        SinglyLinkedListNode temp = headNode;
        Hashtable<Integer, SinglyLinkedListNode> table = new Hashtable<Integer, SinglyLinkedListNode>();
        int count = 0;
        while(temp!= null){
            table.put(++count , temp);
            temp = temp.getNext();
        }

        return table.get(count/2);

    }


    // with one scan

    public SinglyLinkedListNode findMidOfLLInOneScan(SinglyLinkedListNode headNode){
        SinglyLinkedListNode fast = headNode;
        SinglyLinkedListNode slow = headNode;


        while( fast.getNext()!= null && fast.getNext().getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();

        }

         return slow;
    }


}
