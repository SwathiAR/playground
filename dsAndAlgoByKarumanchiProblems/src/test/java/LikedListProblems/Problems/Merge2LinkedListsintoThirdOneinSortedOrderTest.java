package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedList;
import LikedListProblems.SinglyLinkedListNode;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 9/15/2015.
 */
public class Merge2LinkedListsintoThirdOneinSortedOrderTest {

    @Test
    public void testMerge() {


        SinglyLinkedListNode node = new SinglyLinkedListNode(1);
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(8);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(9);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode node6 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode node7 = new SinglyLinkedListNode(8);

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        SinglyLinkedList singlyLinkedList2 = new SinglyLinkedList();
        singlyLinkedList.insertInLinkedList(node, 1);
        singlyLinkedList.insertInLinkedList(node1, 2);
        singlyLinkedList.insertInLinkedList(node2, 3);
        singlyLinkedList.insertInLinkedList(node3, 4);
        singlyLinkedList2.insertInLinkedList(node4, 1);
        singlyLinkedList2.insertInLinkedList(node5, 2);
        singlyLinkedList2.insertInLinkedList(node6, 3);
        singlyLinkedList2.insertInLinkedList(node7, 4);


        Merge2LinkedListsintoThirdOneinSortedOrder merging = new Merge2LinkedListsintoThirdOneinSortedOrder();
        System.out.println(merging.merge2LLintoThirdwinortedOrder(singlyLinkedList.getHeadNode() ,singlyLinkedList2.getHeadNode()));






    }

}