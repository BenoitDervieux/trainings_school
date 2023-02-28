package recreation_doubly;

public class DoublyLL {
    private DoublyNode head;
    private DoublyNode tail;
    private int size; 

    public DoublyLL() {
        head = new DoublyNode(null, null, null);
        tail = new DoublyNode(null, null, null);
        head.setNext(tail);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String getFirst() {
        if(isEmpty()) {
            return "The list is empty";
        }
        return head.getNext().getDescription();
    }

    public String getLast() {
        if(isEmpty()) {
            return "The list is empty";
        }
        return tail.getPrevious().getDescription();
    }

    private void addBetween(String decription, DoublyNode previous, DoublyNode successor) {
        DoublyNode node = new DoublyNode(decription, successor, previous);
        previous.setNext(node);
        successor.setPrevious(node);
        size++;
    }

    public void addFirst(String description) {
        addBetween(description, head, head.getNext());
    }

    public void addLast(String description) {
        addBetween(description, tail.getPrevious(), tail);
    }

    private String remove(DoublyNode node) {
        DoublyNode previous = node.getPrevious();
        DoublyNode successor = node.getNext();

        previous.setNext(successor);
        successor.setPrevious(previous);
        size--;
        return node.getDescription();
    }

    public String removeFirst() {
        if (isEmpty()) {
            return null;
        }
         return remove(head.getNext());
    }

    public String removeLast() {
        if (isEmpty()) {
            return null;
        }
         return remove(tail.getPrevious());
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("The list is empty");;
        } else {
            System.out.println("Traverse the list");
            DoublyNode traverse = head.getNext();

            while(traverse != tail) {
                System.out.print(traverse.getDescription() + " ");
                traverse = traverse.getNext();
            }
            System.out.println();

        
        }


    }
    
}
