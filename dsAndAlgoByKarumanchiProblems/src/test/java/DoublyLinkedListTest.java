import LikedListProblems.DoublyLinkedList;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 9/8/2015.
 */
public class DoublyLinkedListTest {

    @Test
    public void testDLLimplementation(){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
       Assert.assertEquals(doublyLinkedList.insertNode("swathi", 2).toString(), "LikedListProblems.DLLNode{data=swathi, next=null}");
        Assert.assertEquals(doublyLinkedList.insertNode("shruthi", 1).toString(), "LikedListProblems.DLLNode{data=shruthi, next=LikedListProblems.DLLNode{data=swathi, next=null}}");
        Assert.assertEquals(doublyLinkedList.insertNode("shwetha", 3).toString(), "LikedListProblems.DLLNode{data=shruthi, next=LikedListProblems.DLLNode{data=swathi, next=LikedListProblems.DLLNode{data=shwetha, next=null}}}");
        Assert.assertEquals(doublyLinkedList.insertNode("chethan", 1).toString(), "LikedListProblems.DLLNode{data=chethan, next=LikedListProblems.DLLNode{data=shruthi, next=LikedListProblems.DLLNode{data=swathi, next=LikedListProblems.DLLNode{data=shwetha, next=null}}}}");
        Assert.assertEquals(doublyLinkedList.deleteNode(1).toString(), "LikedListProblems.DLLNode{data=shruthi, next=LikedListProblems.DLLNode{data=swathi, next=LikedListProblems.DLLNode{data=shwetha, next=null}}}");
        Assert.assertEquals(doublyLinkedList.deleteNode( 3).toString(), "LikedListProblems.DLLNode{data=shruthi, next=LikedListProblems.DLLNode{data=swathi, next=null}}");
        Assert.assertEquals(doublyLinkedList.deleteNode(2).toString(), "LikedListProblems.DLLNode{data=swathi, next=null}");
    }

}