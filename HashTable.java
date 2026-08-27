public class HashTable {
    // hash with chaining for collision
    private Node[] table;
    private int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = new Node[capacity];
    }

    private int hash(int key) {
        return Math.abs(key) % capacity;
    }

    // search from hashtable
    public Node search(int key) {
        int index = hash(key);
        Node current = table[index];
        while (current != null) {
            if (current.key == key) {
                return current;
            }
            current = current.nextInTable;
        }
        return null;
    }

    // insert into hashtable
    public void insert(Node node) {
        int index = hash(node.key);
        if (table[index] == null) {
            table[index] = node;
        } else {
            Node current = table[index];
            while (current.nextInTable != null) {
                current = current.nextInTable;
            }
            current.nextInTable = node;
        }
    }

    // delete from hash table
    public Node delete(int key) {
        int index = hash(key);
        Node current = table[index];
        Node prev = null;
        while (current != null) {
            if (current.key == key) {
                // check position
                if (prev == null) {// if the node at the top
                    table[index] = current.nextInTable;
                } else {// if key in mid or tail
                    prev.nextInTable = current.nextInTable;
                }
                return current;
            }
            prev = current;
            current = current.nextInTable;// update
        }
        return null;
    }

    
}