package recreation_doubly;

public class DoublyNode {

    private String description;
    private DoublyNode next;
    private DoublyNode previous;

    public DoublyNode(String description, DoublyNode next, DoublyNode previous) {
        this.description = description;
        this.next = next;
        this.previous = previous;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }
    
}
