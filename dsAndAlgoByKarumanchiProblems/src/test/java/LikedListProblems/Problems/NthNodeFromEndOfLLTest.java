package LikedListProblems.Problems;

import LikedListProblems.SinglyLinkedList;
import LikedListProblems.SinglyLinkedListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 9/9/2015.
 */
public class NthNodeFromEndOfLLTest {


    @Test
    public void indNthNodeFromLast(){
        NthNodeFromEndOfLL nthNodeFromEndOfLL = new NthNodeFromEndOfLL();

        SinglyLinkedListNode node = new SinglyLinkedListNode("swathi");
        SinglyLinkedListNode node1 = new SinglyLinkedListNode("swath");
        SinglyLinkedListNode node2 = new SinglyLinkedListNode("swat");
        SinglyLinkedListNode node3 = new SinglyLinkedListNode("swa");
        SinglyLinkedListNode node4 = new SinglyLinkedListNode("sw");
        SinglyLinkedListNode node5 = new SinglyLinkedListNode("s");


        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertInLinkedList(node , 1);
        singlyLinkedList.insertInLinkedList(node1 , 2);
        singlyLinkedList.insertInLinkedList(node2 , 3);
        singlyLinkedList.insertInLinkedList(node3 , 4);
        singlyLinkedList.insertInLinkedList(node4 , 5);
        singlyLinkedList.insertInLinkedList(node5 , 6);



       Assert.assertEquals("LikedListProblems.SinglyLinkedListNode{data=swat, next=LikedListProblems.SinglyLinkedListNode{data=swa, next=LikedListProblems.SinglyLinkedListNode{data=sw, next=LikedListProblems.SinglyLinkedListNode{data=s, next=null}}}}",
                nthNodeFromEndOfLL.findNthNodeFromEnd(4, singlyLinkedList.getHeadNode()).toString());

        Assert.assertEquals("LikedListProblems.SinglyLinkedListNode{data=swat, next=LikedListProblems.SinglyLinkedListNode{data=swa, next=LikedListProblems.SinglyLinkedListNode{data=sw, next=LikedListProblems.SinglyLinkedListNode{data=s, next=null}}}}",
                nthNodeFromEndOfLL.findnthNodeUsingHashTable(4, singlyLinkedList.getHeadNode()).toString());

        Assert.assertEquals("LikedListProblems.SinglyLinkedListNode{data=swat, next=LikedListProblems.SinglyLinkedListNode{data=swa, next=LikedListProblems.SinglyLinkedListNode{data=sw, next=LikedListProblems.SinglyLinkedListNode{data=s, next=null}}}}",
                nthNodeFromEndOfLL.findnthNodeByLength(4, singlyLinkedList.getHeadNode()).toString());

        Assert.assertEquals("LikedListProblems.SinglyLinkedListNode{data=swat, next=LikedListProblems.SinglyLinkedListNode{data=swa, next=LikedListProblems.SinglyLinkedListNode{data=sw, next=LikedListProblems.SinglyLinkedListNode{data=s, next=null}}}}",
                nthNodeFromEndOfLL.findnthNode(4, singlyLinkedList.getHeadNode()).toString());

    }
}