package recreation_doubly;

public class Main {

    public static void main(String[] args) {

        
    DoublyLL list = new DoublyLL();

    list.addFirst("Michel");
    list.addFirst("Wesh alors");
    list.addFirst("Alkapote");

    list.printList();

    list.removeLast();

    list.printList();

    }


    
}
