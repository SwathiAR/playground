package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedList;
import LikedListProblems.SinglyLinkedListNode;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 9/13/2015.
 */
public class FindingYIntersectingPointOf2LinkedListTest {

    @Test
    public void testFindingYIntersectingPoint(){

        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();


        SinglyLinkedListNode node = new SinglyLinkedListNode("swathi");
        SinglyLinkedListNode node1 = new SinglyLinkedListNode("Shruthi");
        SinglyLinkedListNode node2 = new SinglyLinkedListNode("Shwetha");
        SinglyLinkedListNode node3 = new SinglyLinkedListNode("Appa");
        SinglyLinkedListNode node4 = new SinglyLinkedListNode("Amma");
        SinglyLinkedListNode node5 = new SinglyLinkedListNode("Chethan");
        SinglyLinkedListNode node6 = new SinglyLinkedListNode("Pallavi");


        list1.insertInLinkedList(node , 1);
        list1.insertInLinkedList(node1 , 2);
        list1.insertInLinkedList(node2 , 3);
        list1.insertInLinkedList(node3 , 4);
        list2.insertInLinkedList(node4 , 1);
        list2.insertInLinkedList(node5 , 2);
        list2.insertInLinkedList(node6 ,3);
        node6.setNext(node2);


        FindingYIntersectingPointOf2LinkedList finding = new FindingYIntersectingPointOf2LinkedList();

        System.out.println(finding.findYintersectionPoint(list1.getHeadNode(), list2.getHeadNode()));

        System.out.println(finding.findYIntersecionByHashTable(list1.getHeadNode(), list2.getHeadNode()));

        System.out.println(finding.findYIntersectionUsing2Stacks(list1.getHeadNode(), list2.getHeadNode()));

        System.out.println(finding.findYIntersection(list1.getHeadNode(), list2.getHeadNode()));











    }






}