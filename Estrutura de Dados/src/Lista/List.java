package Lista;

public class List<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public List() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    // Add data to list
    void add(T data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    // Function to add data at specific place
    public void addSpecificPlace(T data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Indice fora dos limites da lista");
        }

        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = first;
            first = newNode;
            if (size == 0) {
                last = newNode;
            }
        } else {
            Node newNode = new Node(data);
            Node before = getNode(index - 1);
            newNode.next = before.next;
            before.next = newNode;
        }
        size++;
    }

    // Function to remove a node from the list
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice fora dos limites da lista");
        }

        if (index == 0) {
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node before = getNode(index - 1);
            before.next = before.next.next;
            if (before.next == null) {
                last = before;
            }
        }
        size--;
    }

    // Get node
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice fora dos limites da lista");
        }
        return getNode(index).data;
    }

    // Check if the list is empty
    public boolean empty() {
        return size == 0;
    }

    // Get list size
    public int sizeList() {
        return size;
    }

    // Clear the list
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    // Main method to obtain the data
    private Node getNode(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Print data
    public void print() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();
    }
}
