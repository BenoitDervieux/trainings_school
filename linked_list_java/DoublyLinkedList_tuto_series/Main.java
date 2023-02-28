package DoublyLinkedList_tuto_series;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList2 dll = new DoublyLinkedList2();

        dll.addFirst(69);
        dll.addFirst(42);
        dll.addFirst(38);
        dll.addFirst(22);

        dll.printList();
        dll.addLast(50);

        dll.removeFirst();

        dll.printList(); 

        dll.removeLast();

        dll.printList(); 

        
    }
    
}
