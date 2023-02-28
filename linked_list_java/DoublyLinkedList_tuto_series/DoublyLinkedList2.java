package DoublyLinkedList_tuto_series;

public class DoublyLinkedList2 {
    
    private DLLNode header;
    private DLLNode trailer;
    private int size;

    public DoublyLinkedList2() {
        header = new DLLNode(null, null, null);
        trailer = new DLLNode(null, null, null);
        header.setNext(trailer);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer first() {
        if (isEmpty()) {
            return null;
        }

        return header.getNext().getValue();
    }

    public Integer last() {
        if (isEmpty()) {
            return null;
        }

        return trailer.getPrev().getValue();
    }

    public void addFirst(Integer value) {
        addBetween(value, header, header.getNext());
    }

    public void addLast(Integer value) {
        addBetween(value, trailer.getPrev(), trailer);
    }

    private void addBetween(Integer value, DLLNode predecessor, DLLNode successor) {
        DLLNode node = new DLLNode(value, predecessor, successor);
        predecessor.setNext(node);
        successor.setPrev(node);
        size++;
    }

    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }
        return remove(header.getNext());
    }

    public Integer removeLast() {
        if (isEmpty()) {
            return null;
        }
        return remove(trailer.getPrev());
    }

    private Integer remove(DLLNode node) {
        DLLNode precedessor = node.getPrev();
        DLLNode successor = node.getNext();

        precedessor.setNext(successor);
        successor.setPrev(precedessor);
        size--;

        return node.getValue();
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Traversing the list:");

            DLLNode start = header.getNext();
            while (start != trailer) {
                System.out.print(start.getValue() + " ");

                start = start.getNext();
            }
            System.out.println("\nThe size of the list: " + size);
        }
    }






}
