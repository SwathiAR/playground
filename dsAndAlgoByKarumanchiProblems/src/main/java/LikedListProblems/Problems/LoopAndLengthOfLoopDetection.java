package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;

/**
 * Created by swathi on 9/10/2015.
 */
public class LoopAndLengthOfLoopDetection {

    public int findLengthOfCyclicLoopInLinkedList(SinglyLinkedListNode headNode){

        SinglyLinkedListNode slow = headNode;
        SinglyLinkedListNode fast = headNode;
        boolean loopExists = false;
        int count = 0;
        while(fast.getNext()!=null && fast.getNext().getNext() !=null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

            if (loopExists) {
                do{
                    slow=slow.getNext();
                   count++;
               }while (slow!=fast);
            }


    return  count;
    }




}
