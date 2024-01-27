package data_structures;

public class SinglyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public int size;

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        }
        this.tail.next = newNode;
        this.tail = newNode;
        size++;
    }

    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        }
        newNode.next = this.head;
        this.head = newNode;
        size++;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    private void checkBounds(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds for list of size " + this.size);
        }
    }

    public T get(int i) {
        checkBounds(i);
        int j = 0;
        Node<T> curr = this.head;
        while (j < i) {
            curr = curr.next;
            j++;
        }
        return curr.data;
    }

    public void insert(T data, int i) {
        checkBounds(i);

        // Prepend
        if (i == 0) {
            this.prepend(data);
        }

        // Append
        if (i == this.size) {
            this.append(data);
        }

        Node<T> newNode = new Node<>(data);
        int j = 0;

        // Find node at index i - 1
        Node<T> curr = this.head;
        while (j < i - 1) {
            curr = curr.next;
            j++;
        }

        // curr.next will be the element at index i
        newNode.next = curr.next;
        curr.next = newNode;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) return "Empty list";
        String str = this.head.data.toString();
        Node<T> curr = this.head.next;
        while (curr != null) {
            str += " -> ";
            str += curr.data.toString();
            curr = curr.next;
        }
        return str;
    }
}
