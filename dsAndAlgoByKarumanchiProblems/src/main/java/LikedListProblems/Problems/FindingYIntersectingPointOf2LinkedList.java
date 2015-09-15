package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedList;
import LikedListProblems.SinglyLinkedListNode;

import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by swathi on 9/13/2015.
 */
public class FindingYIntersectingPointOf2LinkedList {

    //Brute Force Method
    public SinglyLinkedListNode findYintersectionPoint(SinglyLinkedListNode headNode1 , SinglyLinkedListNode headNode2){

        SinglyLinkedListNode temp1 = headNode1;
        SinglyLinkedListNode temp2 = headNode2;

        while (temp1.getNext() != null) {
            temp2 = headNode2;
            while (temp2.getNext() != null) {
                if (temp1.getNext().equals(temp2.getNext())) {
                    return temp1.getNext();
                }
                temp2 = temp2.getNext();
            }
            temp1 = temp1.getNext();
        }

return null;

    }


//Using HashTable
    public SinglyLinkedListNode findYIntersecionByHashTable(SinglyLinkedListNode headNode1 , SinglyLinkedListNode headNode2){
        Hashtable<Integer , SinglyLinkedListNode> table2 = new Hashtable<Integer, SinglyLinkedListNode>();
        int count = 0;


        while(headNode2 != null){
            table2.put(count++ , headNode2);
            headNode2 = headNode2.getNext();
        }

        while(headNode1 != null){

            if((table2.containsValue(headNode1))){
                return headNode1;
            }
            headNode1 = headNode1.getNext();
        }





        return null;


    }

    //Using Stacks
    public SinglyLinkedListNode findYIntersectionUsing2Stacks(SinglyLinkedListNode headNode1 , SinglyLinkedListNode headNode2){

        Stack<SinglyLinkedListNode> stack1 = new Stack<SinglyLinkedListNode>();
        Stack<SinglyLinkedListNode> stack2 = new Stack<SinglyLinkedListNode>();

        while(headNode1 != null){
            stack1.push(headNode1);
            headNode1 = headNode1.getNext();
        }

        while(headNode2 != null){
            stack2.push(headNode2);
            headNode2 = headNode2.getNext();
        }

        SinglyLinkedListNode temp = stack1.peek();

        while(stack1.pop().equals(stack2.pop())){
          temp = stack1.peek();
        }

         return temp.getNext();



    }

//By Finding Difference in length of 2 lists
    public SinglyLinkedListNode findYIntersection(SinglyLinkedListNode headNode1 , SinglyLinkedListNode headNode2){


        int length1 = getLength(headNode1);
        int length2 = getLength(headNode2);

        int lengthDiff = Math.abs(length1-length2);

        if(length1> length2){
            int count = 0;
            while (count<lengthDiff)
            headNode1 = headNode1.getNext();
            count++;
        }
        if(length2>length1) {
            int count = 0;
            while (count < lengthDiff) {
                headNode2 = headNode2.getNext();
                count++;
            }
        }


        while(!headNode1.getNext().equals(headNode2.getNext())){
            headNode1 = headNode1.getNext();
            headNode2 = headNode2.getNext();
        }

        return headNode1.getNext();







    }

    private int getLength(SinglyLinkedListNode headNode) {

    int length = 0;
        while(headNode != null){
            length++;
            headNode = headNode.getNext();
        }

      return  length;
    }


}
