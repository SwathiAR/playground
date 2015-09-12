package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedList;
import LikedListProblems.SinglyLinkedListNode;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 9/12/2015.
 */
public class InsertionOfNodeInSortedLinkedListTest {

    @Test
            public void testInsertingNodeInSortedLL() {


        SinglyLinkedListNode node = new SinglyLinkedListNode(1);
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(7);

        SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(4);
        SinglyLinkedListNode nodeToInsert1 = new SinglyLinkedListNode(0);




        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList();

        singlyLinkedList.insertInLinkedList(node, 1);
        singlyLinkedList.insertInLinkedList(node1, 2);
        singlyLinkedList.insertInLinkedList(node2, 3);
        singlyLinkedList.insertInLinkedList(node3, 4);
        singlyLinkedList.insertInLinkedList(node4, 5);
        singlyLinkedList.insertInLinkedList(node5, 6);

       InsertionOfNodeInSortedLinkedList insertion = new InsertionOfNodeInSortedLinkedList();
        System.out.println(insertion.insertNode(singlyLinkedList.getHeadNode(), nodeToInsert));
        System.out.println(insertion.insertNode(singlyLinkedList.getHeadNode(), nodeToInsert1));
        System.out.println(insertion.insertNode(singlyLinkedList1.getHeadNode(), nodeToInsert1));

    }
}