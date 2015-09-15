package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedListNode;

/**
 * Created by swathi on 9/15/2015.
 */
public class DisplayingLinkedListFromEnd {
    public void displayLinkedListFromEnd(SinglyLinkedListNode headNode){

        if(headNode==null){
            return ;
        }
         displayLinkedListFromEnd(headNode.getNext());
        System.out.println(headNode.getData());

    }

}
