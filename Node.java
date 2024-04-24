public class Node {
    private Object data;
    private Node next;

    public Node(Object newData){ // constructor method that creates the "last" node in order
        data = newData;
        next = null;
    }
    public Node(Object newData, Node nextNode){ // constructor method that creates a new node that references/points to the next node in position
        data = newData;
        next = nextNode;
    }
    public void setData(Object newData){ // in the set methods if you set this.data = to newData the Node constructor method becomes undefined in the main
        data = newData;
    }
    public Object getData(){
        return data; 
    }
    public void setNext(Node nextNode){
        next = nextNode;
    }
    public Node getNext(){
        return next;
    }
}
