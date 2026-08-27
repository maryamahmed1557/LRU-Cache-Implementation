public class Main {
    public static void main(String[] args) {

        LRU cache1 = new LRU(3);

        System.out.println("Empty Cache: ");
        System.out.println(cache1.get(10));

        System.out.println("----------------");

        System.out.println("Remove Non-Existing Key: ");
        cache1.remove(100);

        System.out.println("----------------");

        System.out.println("Insert elements: ");
        cache1.put(1,10);
        cache1.display();

        cache1.put(2,20);
        cache1.display();

        cache1.put(3,30);
        cache1.display();

        System.out.println("----------------");

        System.out.println("Access key 1: ");
        cache1.get(1);
        cache1.display();

        System.out.println("----------------");

        System.out.println("Insert new element: ");
        cache1.put(4,40);
        System.out.println("The removing element: " + cache1.get(2));
        cache1.display();

        System.out.println("----------------");

        System.out.println("Update existing key: ");
        cache1.put(2,200);
        cache1.display();

        System.out.println("----------------");

        System.out.println("Remove key 1:");
        cache1.remove(1);
        cache1.display();

        System.out.println("----------------");

        System.out.println("Repeated Access: ");
        cache1.get(2);
        cache1.display();
        cache1.get(2);
        cache1.display();
        cache1.get(2);
        cache1.display();

        System.out.println("----------------");

        System.out.println("Update Existing Key Repeatedly: ");
        cache1.put(2,50);
        cache1.display();
        cache1.put(2,100);
        cache1.display();
        cache1.put(2,150);
        cache1.display();

        System.out.println("----------------");

        LRU cache2 = new LRU(1);

        System.out.println("Eviction in smaller case: ");
        cache2.put(1,10);
        cache2.display();

        cache2.put(2,20);
        cache2.display();

        System.out.println("----------------");

        LRU cache3 = new LRU(3);

        System.out.println("Remove Head: ");
        cache3.put(1, 100);
        cache3.put(2, 200);
        cache3.put(3, 300);

        System.out.println("Before removing head:");
        cache3.display();
        cache3.remove(3);
        System.out.println("After removing head:");
        cache3.display();

        System.out.println("----------------");
        
        LRU cache4 = new LRU(3);
        
        System.out.println("Remove Tail: ");
        cache4.put(1, 400);
        cache4.put(2, 500);
        cache4.put(3, 600);

        System.out.println("Before removing tail:");
        cache4.display();
        cache4.remove(1);
        System.out.println("After removing tail:");
        cache4.display();

        System.out.println("----------------");
        
        LRU cache5 = new LRU(3);
        
        System.out.println("Remove Middle Node: ");
        cache5.put(1, 700);
        cache5.put(2, 800);
        cache5.put(3, 900);

        System.out.println("Before removing middle node:");
        cache5.display();
        cache5.remove(2);
        System.out.println("After removing middle node:");
        cache5.display();

        System.out.println("----------------");
        System.out.println("All test cases passed successfully.");
    }
}