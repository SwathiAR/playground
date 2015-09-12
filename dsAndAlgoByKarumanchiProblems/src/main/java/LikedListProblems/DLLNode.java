package LikedListProblems;

/**
 * Created by swathi on 9/2/2015.
 */
public class DLLNode<T extends Comparable> {

    private T data;
    private DLLNode next;
    private  DLLNode previous;

    public DLLNode(){

    }

    public DLLNode(T data){
        this.data = data;
        next = null;
        previous = null;
    }

    public DLLNode(T data , DLLNode previous , DLLNode next){
        this.data = data;
        this.previous = previous;
        this.next = next;

    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public DLLNode getNext(){
        return next;
    }

    public void setNext(DLLNode next){
        this.next = next;
    }

    public  DLLNode getPrevious(){
        return previous;
    }

    public void setPrevious(DLLNode previous){
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "LikedListProblems.DLLNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
