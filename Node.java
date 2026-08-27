class Node {
    int key;
    int value;
    Node prev;
    Node next;
    Node nextInTable;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}