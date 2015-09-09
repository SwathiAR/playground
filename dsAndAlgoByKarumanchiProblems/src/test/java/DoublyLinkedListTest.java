import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 9/8/2015.
 */
public class DoublyLinkedListTest {

    @Test
    public void testDLLimplementation(){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
       Assert.assertEquals(doublyLinkedList.insertNode("swathi", 2).toString(), "DLLNode{data=swathi, next=null}");
        Assert.assertEquals(doublyLinkedList.insertNode("shruthi", 1).toString(), "DLLNode{data=shruthi, next=DLLNode{data=swathi, next=null}}");
        Assert.assertEquals(doublyLinkedList.insertNode("shwetha", 3).toString(), "DLLNode{data=shruthi, next=DLLNode{data=swathi, next=DLLNode{data=shwetha, next=null}}}");
        Assert.assertEquals(doublyLinkedList.insertNode("chethan", 1).toString(), "DLLNode{data=chethan, next=DLLNode{data=shruthi, next=DLLNode{data=swathi, next=DLLNode{data=shwetha, next=null}}}}");
        Assert.assertEquals(doublyLinkedList.deleteNode(1).toString(), "DLLNode{data=shruthi, next=DLLNode{data=swathi, next=DLLNode{data=shwetha, next=null}}}");
        Assert.assertEquals(doublyLinkedList.deleteNode( 3).toString(), "DLLNode{data=shruthi, next=DLLNode{data=swathi, next=null}}");
        Assert.assertEquals(doublyLinkedList.deleteNode(2).toString(), "DLLNode{data=swathi, next=null}");
    }

}