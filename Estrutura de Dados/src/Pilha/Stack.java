package Pilha;

public class Stack {

    //attributes
    private Node top;
    private int size;
    private int  indexCounter;

    public Stack(){
        this.top = null;
        this.size = 0;
        this.indexCounter = 0;
    }

    //class node to store the data
    public class Node{
        //attributes
        private String data;
        private Node next;
        private int index;
        public Node(String data) {
            this.data = data;
            this.next = null;
            //add one more to each node created
            this.index = indexCounter++;
        }
    }
}
