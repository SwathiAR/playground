package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.Hashtable;

/**
 * Created by swathi on 9/10/2015.
 */
public class NullOrCyclicTerminatedLL {

    //Brute Force method
    public boolean findIfLLIsCyclicTerminated(SinglyLinkedListNode headNode) {

        SinglyLinkedListNode temp = headNode;

        if (temp.getNext() == headNode) {
            return true;
        }
        while (temp.getNext() != null && temp.getNext() != headNode) {
            if (findIfTheNodeHas2Ptrs(temp) == true) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    private boolean findIfTheNodeHas2Ptrs(SinglyLinkedListNode temp) {
        SinglyLinkedListNode first = temp;
        SinglyLinkedListNode ptr = temp;
        while (ptr.getNext() != first && ptr.getNext() != null) {
            ptr = ptr.getNext();
        }

        if (ptr.getNext() == first) {
            return true;
        }
        return false;
    }

    public boolean CheckCyclicterminatedLLUsingHashTable(SinglyLinkedListNode headNode) {
        SinglyLinkedListNode temp = headNode;
        Hashtable<Integer, SinglyLinkedListNode> table = new Hashtable<Integer, SinglyLinkedListNode>();
        int count = 0;
        while (temp.getNext() != null && temp.getNext() != headNode) {
            if (table.containsValue(temp)) {
                return true;
            } else {

                table.put(count++, temp);
                temp = temp.getNext();
            }


        }
        return false;


    }



    public boolean floydCycleFinding(SinglyLinkedListNode headNode){

        SinglyLinkedListNode slow =headNode;
        SinglyLinkedListNode fast=headNode;

        while(fast.getNext()!= null && fast.getNext().getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(slow==fast){
                return true;
            }

        }
         return false;


    }






}





