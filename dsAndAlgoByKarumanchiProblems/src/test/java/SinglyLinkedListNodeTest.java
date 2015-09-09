import LikedListProblems.SinglyLinkedListNode;
import LikedListProblems.SinglyLinkedListOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 9/2/2015.
 */
public class SinglyLinkedListNodeTest {
    SinglyLinkedListOperations linkedListOperations = new SinglyLinkedListOperations();

    @Test
            public void testLinkedList() {
        SinglyLinkedListNode headNode = new SinglyLinkedListNode("swathi");
        headNode.setNext(null);
        Assert.assertEquals(headNode.getData() , "swathi");
        Assert.assertEquals(headNode.getNext() , null);

        Assert.assertEquals(linkedListOperations.listLength(headNode), 1);

        SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode("shruthi");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(headNode, nodeToInsert, 1).toString(), "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=null}}");

        SinglyLinkedListNode nodeToInsert2 = new SinglyLinkedListNode("chinnu");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert2 ,linkedListOperations.listLength(nodeToInsert)).toString() ,"LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=null}}}");

        SinglyLinkedListNode nodeToInsert3 = new SinglyLinkedListNode("chethan");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert3  , linkedListOperations.listLength(nodeToInsert) +1).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=null}}}}");


        SinglyLinkedListNode nodeToInsert4 = new SinglyLinkedListNode("unknown");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert4  , 5).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}");


        SinglyLinkedListNode nodeToInsert5 = new SinglyLinkedListNode("unknown2");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert5  , 3).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=unknown2, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}}");

        SinglyLinkedListNode nodeToInsert6 = new SinglyLinkedListNode("unknown3");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert6  , 1).toString() , "LikedListProblems.SinglyLinkedListNode{data=unknown3, next=LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=unknown2, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}}}");


        Assert.assertEquals(linkedListOperations.deleteNodeFromLinkedList(nodeToInsert6 , 1).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=unknown2, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}}");


       Assert.assertEquals(linkedListOperations.deleteNodeFromLinkedList(nodeToInsert , 3).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}");

       Assert.assertEquals(linkedListOperations.deleteNodeFromLinkedList(nodeToInsert , 5 ).toString(), "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=null}}}}");
    }

}