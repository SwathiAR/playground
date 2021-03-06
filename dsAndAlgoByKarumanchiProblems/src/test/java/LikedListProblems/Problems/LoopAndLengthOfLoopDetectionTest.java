package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedList;
import LikedListProblems.SinglyLinkedListNode;
import org.testng.annotations.Test;

/**
 * Created by swathi on 9/10/2015.
 */
public class LoopAndLengthOfLoopDetectionTest {
    @Test
    public void testTheLengthOfCyclicLL() {

        SinglyLinkedListNode node = new SinglyLinkedListNode("swathi");
        SinglyLinkedListNode node1 = new SinglyLinkedListNode("Shruthi");
        SinglyLinkedListNode node2 = new SinglyLinkedListNode("Shwetha");
        SinglyLinkedListNode node3 = new SinglyLinkedListNode("Appa");
        SinglyLinkedListNode node4 = new SinglyLinkedListNode("Amma");
        SinglyLinkedListNode node5 = new SinglyLinkedListNode("Chethan");


        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertInLinkedList(node , 1);
        singlyLinkedList.insertInLinkedList(node1 , 2);
        singlyLinkedList.insertInLinkedList(node2 , 3);
        singlyLinkedList.insertInLinkedList(node3 , 4);
        singlyLinkedList.insertInLinkedList(node4 , 5);
        singlyLinkedList.insertInLinkedList(node5 , 6);
        node5.setNext(node2);

        LoopAndLengthOfLoopDetection loopAndLengthOfLoopDetection = new LoopAndLengthOfLoopDetection();
       System.out.println(loopAndLengthOfLoopDetection.findLengthOfCyclicLoopInLinkedList(singlyLinkedList.getHeadNode()));

    }
}