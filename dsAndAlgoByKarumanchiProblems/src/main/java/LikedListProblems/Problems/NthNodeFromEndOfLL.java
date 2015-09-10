package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;
import LikedListProblems.SinglyLinkedList;

import java.util.Hashtable;

/**
 * Created by swathi on 9/9/2015.
 */
public class NthNodeFromEndOfLL {

    //Using Brute Force Approach O(n2)
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

    //Using Hash Map O(M) M=Length of the list
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

//Using length O(n)+O(n) ~ O(n)
    public  SinglyLinkedListNode findnthNodeByLength(int n , SinglyLinkedListNode headNode){

        int length=1;
        SinglyLinkedListNode temp = headNode , out = headNode;

        while(temp.getNext()!=null){
            length++;
            temp = temp.getNext();

        }
        int count=0;

        while(count<length-n){
            out = out.getNext();
            count++;
        }

        return out;
    }

//Using length in one scan O(n)
    public SinglyLinkedListNode findnthNode(int n , SinglyLinkedListNode headNode){

        SinglyLinkedListNode ptrNthNodeTemp = null;
        SinglyLinkedListNode prtTemp = headNode;

        int count = 1;
        while(count<n){
            prtTemp = prtTemp.getNext();
            count++;
        }
        ptrNthNodeTemp = headNode;

        while (prtTemp.getNext() != null){
            prtTemp = prtTemp.getNext();
            ptrNthNodeTemp = ptrNthNodeTemp.getNext();
        }

        return  ptrNthNodeTemp;

    }
}
