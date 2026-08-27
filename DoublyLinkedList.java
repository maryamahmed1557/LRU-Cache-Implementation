public class DoublyLinkedList {
    Node Head;
    Node Tail;
    int currentSize;

    public DoublyLinkedList() {
        this.Head = null;
        this.Tail = null;
        this.currentSize = 0;
    }
     public boolean isEmpty() {
        return this.Head == null;
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("Cache is Empty!!!");
        } else {
            Head = Head.next;
            if (Head != null) {
                Head.prev = null;
            }
            if (Head == null) {
                Tail = null;
            } currentSize--;
        }
    }

    public void removeTail() {
        if (isEmpty()) {
            System.out.println("Cache is Empty!!!");
        } else if (Head == Tail) {
            removeHead();
        } else {
            Tail = Tail.prev;
            Tail.next = null;
            currentSize--;
        }
    }

    public void removeNode(Node node) {
        if (node == Head) {
            removeHead();
        } else if (node == Tail) {
            removeTail();
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            currentSize--;
        }
    }

   

    public Node removeLeastUsedItem() {
        Node node = null;
        if (isEmpty()) {
            System.out.println("Cache Is Empty");
            return null;
        } else if (Head == Tail) {
            node = Tail;
            removeHead();
            return node;
        } else {
            node = Tail;
            Tail.prev.next = null;
            Tail = Tail.prev;
            return node;

        }
    }

    public void movetoFront(Node node) {
        if (node==Head) 
            return;
        removeNode(node);
        InsertAtFront(node);

    }

    public void InsertAtFront(Node node){
        node.prev=null;
        node.next=Head;
        if(Head!=null){
            Head.prev=node;
        }
        Head=node;
        if(Tail==null){
            Tail=node;
        }
        currentSize++;
    } 

    public void display() {
    Node current = Head;

    while (current != null) {
        System.out.print("[" + current.key + ":" + current.value + "] ");
        current = current.next;
    }
    System.out.println();
}
}