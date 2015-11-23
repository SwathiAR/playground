package Stack;

/**
 * Created by swathi on 11/16/2015.
 */
public class FixedSizeArrayStack {

    protected int[] arrayStack;
    protected int top = -1;
    public static final int CAPACITY = 10;
    protected int capacity ;

    public FixedSizeArrayStack(){
        this(CAPACITY);
    }

    public  FixedSizeArrayStack(int capacity){
        arrayStack = new int[capacity];
        this.capacity = capacity;
    }

    public  int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int data;
        data = arrayStack[top];
        arrayStack[top--] = Integer.MIN_VALUE;
        return  data;
    }

    public void push(int data){
        if(top >= capacity ){
            throw new RuntimeException("Stack is full");
        }
        arrayStack[++top] = data;

    }

    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return arrayStack[top];

    }

    public int size(){
        return (top +1);

    }

    public boolean isEmpty(){
        return (size() == 0);

    }

    public String toString(){
        String s;
        s = "[ ";
        if(size() > 0){
            s = s + arrayStack[0];
        }
        if(size() > 1) {
            for (int i = 0; i < size() ; i++) {
                s = s + "," + arrayStack[i];
            }
        }
        s=s+" ]";
        return  s;

    }


}
