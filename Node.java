public class Node<T> { // двусвязанный список
    private T item;
    private Node next;
    private Node prev;

    public Node(T item) {
        this.item = item;
    }

    public Node(T item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(T item, Node next, Node prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
