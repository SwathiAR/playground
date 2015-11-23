import java.util.HashMap;

/**
 * Created by swathi on 10/21/2015.
 */
public class LRUcache {

 HashMap<Integer , Node> map = new HashMap<Integer, Node>();
    int capacity;
    Node head = null;
    Node tail = null;

    public LRUcache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key){
      if(map.containsKey(key)){
          Node node = map.get(key);
          remove(node);
          sethead(node);
          return node.value;
      }

        return -1;

    }

    public  void sethead(Node node) {
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }
        head = node;

        if(tail == null){
            tail = head;
        }
    }

    public void remove(Node node) {
        if(node.prev !=null){
            node.prev.next = node.next;
        }else
            {
                head = node.next;
            }

        if(node.next != null){
            node.next.prev = node.prev;
        }
        else
        {
            tail = node.prev;
        }

    }


    public void set(int key , int value) {


        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            sethead(node);
        } else {
            Node nodeToInsert = new Node(key, value);
            if (map.size() >= capacity) {
                map.remove(tail.key);
                remove(tail);

                sethead(nodeToInsert);

            } else
                sethead(nodeToInsert);


            map.put(key, nodeToInsert);

        }

    }
}
