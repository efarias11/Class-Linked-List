import java.util.Random;
public class MainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Random rand = new Random();

        for(int i = 0; i<10; i++){
            int rng = rand.nextInt(100);
            list.add(rng,i); 
        }
        list.addLast('A'); // inserts 'A' to the end of the list
        list.addFirst("Emilio"); // inserts "Emilio" at the begining of the list

        list.show(); // prints all current nodes in the linked list
        list.removeIndex(0); // removing the first index value
        list.removeIndex(4); // removing the 4th index value (length-1)
        System.out.println(" ");
        list.removeValue('G'); // trys to remove the data value G but G is not found
        list.show();
        list.get(3); // finds the node by index and returns its data value 
        list.set("Emilio", 5); // finds the node by index and replaces its data value
        list.show(); 
        list.search('L'); // searches if a value exists in the linked list and returns what node it's in
        list.size(); // outputs how many nodes are in the linked list 
    }
}
