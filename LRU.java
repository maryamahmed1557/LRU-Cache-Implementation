public class LRU {
    HashTable hash;
    DoublyLinkedList list;
    int capacity;
    int size=0;
    
    public LRU(int capacity) {
        this.capacity = capacity;
        this.hash = new HashTable(capacity);
        this.list = new DoublyLinkedList();
    }

    public int get(int key) {
        Node node = hash.search(key);
        if (node != null) {
            list.movetoFront(node);
            return node.value;
        } else
            return -1;
    }

    public void put(int key, int value) {
        Node node = hash.search(key);

        if (node != null) {
            node.value = value;
            list.movetoFront(node);
        } else {
            if ( size >= capacity) {
                Node lastNode = list.removeLeastUsedItem();
                if (lastNode != null) {
                    hash.delete(lastNode.key);
                    size --;
                }
            }
            Node Newnode = new Node(key, value);
            hash.insert(Newnode);
            list.InsertAtFront(Newnode);
            size++;
        }

    }

    public void remove(int key) {
        Node node = hash.search(key);

        if(node != null) {
        list.removeNode(node);
        hash.delete(key);
        size --;
        }
    }

    public void display() {
        list.display();
    }
}
