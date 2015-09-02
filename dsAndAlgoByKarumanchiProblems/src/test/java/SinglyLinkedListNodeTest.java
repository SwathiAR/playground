import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 9/2/2015.
 */
public class SinglyLinkedListNodeTest {
    LinkedListOperations linkedListOperations = new LinkedListOperations();

    @Test
            public void testLinkedList() {
        SinglyLinkedListNode headNode = new SinglyLinkedListNode("swathi");
        headNode.setNext(null);
        Assert.assertEquals(headNode.getData() , "swathi");
        Assert.assertEquals(headNode.getNext() , null);

        Assert.assertEquals(linkedListOperations.listLength(headNode), 1);

        SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode("shruthi");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(headNode, nodeToInsert, 1).toString(), "SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=swathi, next=null}}");

        SinglyLinkedListNode nodeToInsert2 = new SinglyLinkedListNode("chinnu");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert2 ,linkedListOperations.listLength(nodeToInsert)).toString() ,"SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=chinnu, next=SinglyLinkedListNode{data=swathi, next=null}}}");

        SinglyLinkedListNode nodeToInsert3 = new SinglyLinkedListNode("chethan");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert3  , linkedListOperations.listLength(nodeToInsert) +1).toString() , "SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=chinnu, next=SinglyLinkedListNode{data=swathi, next=SinglyLinkedListNode{data=chethan, next=null}}}}");


        SinglyLinkedListNode nodeToInsert4 = new SinglyLinkedListNode("unknown");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert4  , 5).toString() , "SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=chinnu, next=SinglyLinkedListNode{data=swathi, next=SinglyLinkedListNode{data=chethan, next=SinglyLinkedListNode{data=unknown, next=null}}}}}");


        SinglyLinkedListNode nodeToInsert5 = new SinglyLinkedListNode("unknown2");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert5  , 3).toString() , "SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=chinnu, next=SinglyLinkedListNode{data=unknown2, next=SinglyLinkedListNode{data=swathi, next=SinglyLinkedListNode{data=chethan, next=SinglyLinkedListNode{data=unknown, next=null}}}}}}");

        SinglyLinkedListNode nodeToInsert6 = new SinglyLinkedListNode("unknown3");
        Assert.assertEquals(linkedListOperations.insertInLinkedList(nodeToInsert , nodeToInsert6  , 1).toString() , "SinglyLinkedListNode{data=unknown3, next=SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=chinnu, next=SinglyLinkedListNode{data=unknown2, next=SinglyLinkedListNode{data=swathi, next=SinglyLinkedListNode{data=chethan, next=SinglyLinkedListNode{data=unknown, next=null}}}}}}}");


        Assert.assertEquals(linkedListOperations.deleteNodeFromLinkedList(nodeToInsert6 , 1).toString() , "SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=chinnu, next=SinglyLinkedListNode{data=unknown2, next=SinglyLinkedListNode{data=swathi, next=SinglyLinkedListNode{data=chethan, next=SinglyLinkedListNode{data=unknown, next=null}}}}}}");


       Assert.assertEquals(linkedListOperations.deleteNodeFromLinkedList(nodeToInsert , 3).toString() , "SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=chinnu, next=SinglyLinkedListNode{data=swathi, next=SinglyLinkedListNode{data=chethan, next=SinglyLinkedListNode{data=unknown, next=null}}}}}");

       Assert.assertEquals(linkedListOperations.deleteNodeFromLinkedList(nodeToInsert , 5 ).toString(), "SinglyLinkedListNode{data=shruthi, next=SinglyLinkedListNode{data=chinnu, next=SinglyLinkedListNode{data=swathi, next=SinglyLinkedListNode{data=chethan, next=null}}}}");
    }

}