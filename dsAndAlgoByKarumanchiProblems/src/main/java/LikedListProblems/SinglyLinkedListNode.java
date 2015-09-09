package LikedListProblems;

/**
 * Created by swathi on 9/1/2015.
 */
public class SinglyLinkedListNode {
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LikedListProblems.SinglyLinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    private Object data;
    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(Object data){
        this.data = data;
    }

}