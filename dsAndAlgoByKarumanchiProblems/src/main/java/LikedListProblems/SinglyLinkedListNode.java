package LikedListProblems;

/**
 * Created by swathi on 9/1/2015.
 */
public class SinglyLinkedListNode<T extends Comparable> {
    public T getData() {
        return data;
    }

    public void setData(T data) {
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
                "next" + next +
                '}';
    }

    private T data;

    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(T data){
        this.data = data;
    }

}