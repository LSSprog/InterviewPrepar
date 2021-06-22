import java.util.NoSuchElementException;

public class MyTwoSideLinkedList<T> {
    private Node first;
    private Node last;
    private int size;

    public MyTwoSideLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void insertFirst(T item) {
        Node newNode = new Node(item);
        newNode.setNext(first);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.setPrev(newNode);
        }
        first = newNode;
        size++;
    }

    public void insertLast(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.setPrev(last);
            last.setNext(newNode);
        }
        last = newNode;
        size++;
    }

    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) first.getItem();
    }

    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) last.getItem();
    }

    public T removeFirst() {
        T oldNode = getFirst();
        first = first.getNext();
        if (isEmpty()) {
            last = null;
        } else {
            first.setPrev(null);
        }
        size--;
        return oldNode;
    }

    public T removeLast() {
        T oldNode = getLast();
        if (last.getPrev() != null) {
            last.getPrev().setNext(null);
        } else {
            first = null;
        }
        last = last.getPrev();
        size--;
        return oldNode;
    }

    public int indexOf(T item) {
        Node currentNode = first;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getItem().equals(item)) {
                return index;
            }
            currentNode = currentNode.getNext();
            index++;
        }
        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) > -1;
    }

    public void insert(int index, T item) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Индекс " + index + " вне списка");
        }
        if (index == 0) {
            insertFirst(item);
            return;
        }
        if (index == size) {
            insertLast(item);
            return;
        }
        Node currentNode = first;
        int i = 0;
        while (i < (index - 1)) {
            currentNode = currentNode.getNext();
            i++;
        }
        Node newNode = new Node(item);
        newNode.setPrev(currentNode);
        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
        newNode.getNext().setPrev(newNode);
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Индекс " + index + " вне списка");
        }
        if (index == 0) {
            removeFirst();
        }
        if (index == size) {
            removeLast();
        }
        Node currentNode = first;
        int i = 0;
        while (i < index) {
            currentNode = currentNode.getNext();
            i++;
        }
        T itemNode = (T) currentNode.getItem();
        currentNode.getPrev().setNext(currentNode.getNext());
        currentNode.getNext().setPrev(currentNode.getPrev());
        size--;
        return itemNode;
    }

    public boolean remove(T item) {
        if (isEmpty()) {
            return false;
        }
        if (first.getItem().equals(item)) {
            removeFirst();
            return true;
        }
        Node currentNode = first;
        while (currentNode != null && !currentNode.getItem().equals(item)) {
            currentNode = currentNode.getNext();
        }
        if (currentNode == null) {
            return false;
        }
        if (currentNode == last) {
            removeLast();
            return true;
        }
        currentNode.getPrev().setNext(currentNode.getNext());
        currentNode.getNext().setPrev(currentNode.getPrev());
        size--;
        return true;
    }

    @Override
    public String toString() {
        Node currentNode = first;
        StringBuilder sb = new StringBuilder("[");
        while (currentNode != null) {
            sb.append(currentNode.getItem() + ", ");
            currentNode = currentNode.getNext();
        }
        if (isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]" );
        return sb.toString();
    }
}

