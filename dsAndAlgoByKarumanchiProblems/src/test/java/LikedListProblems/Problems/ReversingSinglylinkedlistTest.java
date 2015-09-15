package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedList;
import LikedListProblems.SinglyLinkedListNode;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 9/12/2015.
 */
public class ReversingSinglylinkedlistTest {

    @Test
    public void testReverseSLLByRecursion() throws Exception {
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

        ReversingSinglylinkedlist reversingSinglylinkedlist = new ReversingSinglylinkedlist();
        SinglyLinkedListNode newHeadNode = reversingSinglylinkedlist.reverseSinglyLinkedList(singlyLinkedList.getHeadNode());
        System.out.println(newHeadNode);
    }
}