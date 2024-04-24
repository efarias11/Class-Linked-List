public class LinkedList {
    Node head;

    public void addLast(Object newData){ // calling the Node class and its constructors to create a new node at the end of the linked list
        Node newNode = new Node(newData);

        if(head==null){ // if the head node is empty set it to the new node
            head = newNode;
        }else{
            Node n = head;
            while(n.getNext()!=null){ // goes through the node list until it finds the current last node
                n = n.getNext();
            }
            n.setNext(newNode); // setting the new node as the last node in the linked list
        }
    }
    public void addFirst(Object newData){ // creating a new node at the first in the linked list
        Node newNode = new Node(newData);
        if(head==null) // if head node has no data make this the first node
            head = newNode;
        newNode.setNext(head); // pushing the current first node, by setting it equal to the next
        head = newNode; // overwritting the head node with the newly created node so it becomes the first node
    }
    public void add(Object newData, int index){ // using the "Node" constructor method to insert a new node any where in the linked list by index value
        Node newNode = new Node(newData);
        if(index==0){ // pushing the current head node over and making the new node the first node
            newNode.setNext(head);
            head = newNode;
        }else{
            Node current = head; // starting from the head node
            for(int i = 0; i<index-1 && current !=null; i++){ // traveling through the linked list depending on the index value position
                current = current.getNext(); // finding the original node at the index position
            }
            if(current != null){ // only executes if the current node has data
                newNode.setNext(current.getNext()); // at that index postion, pushing the original node at that index position over
                current.setNext(newNode); // and inserting the new node there
            }else{
                System.out.println("Index out of bounds");
            }
        }
    }
    public void removeIndex(int index){ // to remove the desired node you connect the previous and next node to each other
        Node current = head;
        Node prevNode = null; // creating a previous node to connect it with the current node's next node

        if(current!=null && index==0){ // if the user wants to remove the current head and checks if has data
            head = current.getNext(); // replaces the head node with an empty node
        }else if(current!=null){ 
            for(int i = 0; i<index-1 && current !=null; i++){ // starting from index 0 to desired index
                prevNode = current; // prevNode is = to the current node
                current = current.getNext(); // current node becomes the next node
            }
            prevNode.setNext(current.getNext()); // connects the previous node with the current node's next (deleting the current node)
        }else{
            System.out.println("Index out of bounds");
        }
    }
    public void removeValue(Object value){
        Node current = head;
        Node prevNode = null;
        
        if(head.getData()==value){ // deletes the current head if its data = to the searched value
            head = current.getNext();
        }else if(current!=null){
            while(current.getNext()!=null){ // goes through the linked list until the next node is null
                prevNode=current; // prevNode is = to the current node
                current=current.getNext(); // sets current to the next node
                if(current.getData()==value){ // if the current data is equal to desired value
                    break; // breaks the loop
                }
                if(current.getNext()==null){ 
                    System.out.println("Data value "+value+" can't be found!"); // if value is not found return a error message
                }
            }
            prevNode.setNext(current.getNext()); // connects the previous node with the current node's next (deleting the current node)
        }
    }
    public void show(){ // goes through the nodes and prints them out
        Node current = head;

        while(current.getNext()!=null){
            System.out.print(current.getData()+", ");
            current = current.getNext();
        }
        System.out.print(current.getData());
    }

}
