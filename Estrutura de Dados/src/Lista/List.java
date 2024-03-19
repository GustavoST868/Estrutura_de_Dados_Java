package Lista;

public class List<T> {

    private class Node{
        T data;
        Node next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node first;
    private Node last;
    private int size;
    public List(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
}
