import LikedListProblems.SinglyLinkedListNode;
import LikedListProblems.SinglyLinkedList;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 9/2/2015.
 */
public class SinglyLinkedListNodeTest {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    @Test
    public void testLinkedList() {
        SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode("swathi");
        Assert.assertEquals(singlyLinkedList.insertInLinkedList(nodeToInsert, 1).toString(), "LikedListProblems.SinglyLinkedListNode{data=swathi, next=null}");
        SinglyLinkedListNode nodeToInsert0 = new SinglyLinkedListNode("shruthi");
        Assert.assertEquals(singlyLinkedList.insertInLinkedList(nodeToInsert0, 1).toString(), "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=null}}");

        SinglyLinkedListNode nodeToInsert2 = new SinglyLinkedListNode("chinnu");
        Assert.assertEquals(singlyLinkedList.insertInLinkedList( nodeToInsert2 ,singlyLinkedList.getLength(nodeToInsert)).toString() ,"LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=null}}}");

        SinglyLinkedListNode nodeToInsert3 = new SinglyLinkedListNode("chethan");
        Assert.assertEquals(singlyLinkedList.insertInLinkedList( nodeToInsert3  , singlyLinkedList.getLength(nodeToInsert) +1).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=null}}}}");


        SinglyLinkedListNode nodeToInsert4 = new SinglyLinkedListNode("unknown");
        Assert.assertEquals(singlyLinkedList.insertInLinkedList( nodeToInsert4  , 5).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}");


        SinglyLinkedListNode nodeToInsert5 = new SinglyLinkedListNode("unknown2");
        Assert.assertEquals(singlyLinkedList.insertInLinkedList( nodeToInsert5  , 3).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=unknown2, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}}");

        SinglyLinkedListNode nodeToInsert6 = new SinglyLinkedListNode("unknown3");
        Assert.assertEquals(singlyLinkedList.insertInLinkedList( nodeToInsert6  , 1).toString() , "LikedListProblems.SinglyLinkedListNode{data=unknown3, next=LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=unknown2, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}}}");


        Assert.assertEquals(singlyLinkedList.deleteNodeFromLinkedList(1).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=unknown2, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}}");


        Assert.assertEquals(singlyLinkedList.deleteNodeFromLinkedList( 3).toString() , "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=LikedListProblems.SinglyLinkedListNode{data=unknown, next=null}}}}}");

        Assert.assertEquals(singlyLinkedList.deleteNodeFromLinkedList( 5 ).toString(), "LikedListProblems.SinglyLinkedListNode{data=shruthi, next=LikedListProblems.SinglyLinkedListNode{data=chinnu, next=LikedListProblems.SinglyLinkedListNode{data=swathi, next=LikedListProblems.SinglyLinkedListNode{data=chethan, next=null}}}}");


    }
}

