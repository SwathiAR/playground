package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;

/**
 * Created by swathi on 9/10/2015.
 */
public class LoopAndStartNodeDetectionInLL {

    public SinglyLinkedListNode findStartNodeOfLoop(SinglyLinkedListNode headNode){

        SinglyLinkedListNode slow = headNode;
        SinglyLinkedListNode fast = headNode;


        while(fast.getNext()!=null && fast.getNext().getNext()!= null){

            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(fast==slow) {
                slow = headNode;
                while (slow != fast) {
                    slow = slow.getNext();
                    fast = fast.getNext();
                }
                return slow;
            }



        }

        return  null;
    }




}
