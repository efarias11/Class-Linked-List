public class MainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for(int i = 0; i<10; i++){
            list.add(i+1,i); 
        }
        list.addLast('A'); // inserts 'A' to the end of the list
        list.addFirst("Emilio"); // inserts "Emilio" at the begining of the list

        list.show();
        list.removeIndex(0); // removing the first index value
        list.removeIndex(4); // removing the 4th index value (length-1)
        System.out.println(" ");
        list.removeValue('G'); // trys to remove the data value G but G is not found
        list.show();
    }
}
