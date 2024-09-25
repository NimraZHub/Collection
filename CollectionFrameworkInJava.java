package collectionframeworkinjava;

import java.util.*;

public class CollectionFrameworkInJava {

    public static void main(String[] args) {
        
        // ArrayList
        System.out.println("ArrayList Operations:");
        List<Integer> arrayList = new ArrayList<>();
        performListOperations(arrayList);

        // LinkedList
        System.out.println("\nLinkedList Operations:");
        List<Integer> linkedList = new LinkedList<>();
        performListOperations(linkedList);

        // HashSet
        System.out.println("\nHashSet Operations:");
        Set<Integer> hashSet = new HashSet<>();
        performSetOperations(hashSet);

        // TreeSet
        System.out.println("\nTreeSet Operations:");
        Set<Integer> treeSet = new TreeSet<>();
        performSetOperations(treeSet);

        // HashMap
        System.out.println("\nHashMap Operations:");
        Map<Integer, String> hashMap = new HashMap<>();
        performMapOperations(hashMap);

        // Hashtable
        System.out.println("\nHashtable Operations:");
        Map<Integer, String> hashTable = new Hashtable<>();
        performMapOperations(hashTable);

        // TreeMap
        System.out.println("\nTreeMap Operations:");
        Map<Integer, String> treeMap = new TreeMap<>();
        performMapOperations(treeMap);

        // Stack
        System.out.println("\nStack Operations:");
        Stack<Integer> stack = new Stack<>();
        performStackOperations(stack);

        // Queue (LinkedList)
        System.out.println("\nQueue (LinkedList) Operations:");
        Queue<Integer> queue = new LinkedList<>();
        performQueueOperations(queue);

        // Vector
        System.out.println("\nVector Operations:");
        List<Integer> vector = new Vector<>();
        performListOperations(vector);

        // PriorityQueue
        System.out.println("\nPriorityQueue Operations:");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        performQueueOperations(priorityQueue);
    }

    // Perform operations on Lists (ArrayList, LinkedList, Vector)
    private static void performListOperations(List<Integer> list) {
        // Insert
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After Insertion: " + list);

        // Update
        list.set(1, 25); 
        System.out.println("After Update: " + list);

        // Delete
        list.remove(0); 
        System.out.println("After Deletion: " + list);

        // Traverse using for-each loop
        System.out.println("Traverse using for-each loop:");
        for (int i : list) {
            System.out.println(i);
        }
    }

    // Perform operations on Sets (HashSet, TreeSet)
    private static void performSetOperations(Set<Integer> set) {
        // Insert
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("After Insertion: " + set);

        // Delete
        set.remove(20); // Remove element 20
        System.out.println("After Deletion: " + set);

        // Traverse using Iterator
        System.out.println("Traverse using Iterator:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Perform operations on Maps (HashMap, Hashtable, TreeMap)
    private static void performMapOperations(Map<Integer, String> map) {
        // Insert
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("After Insertion: " + map);

        // Update
        map.put(2, "Two Updated"); 
        System.out.println("After Update: " + map);

        // Delete
        map.remove(1);
        System.out.println("After Deletion: " + map);

        // Traverse using for-each loop 
        System.out.println("Traverse using for-each loop:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Perform operations on Stack
    private static void performStackOperations(Stack<Integer> stack) {
        // Insert (Push)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After Push: " + stack);

        // Delete (Pop)
        stack.pop();
        System.out.println("After Pop: " + stack);

        // Traverse using Iterator
        System.out.println("Traverse using Iterator:");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Perform operations on Queue (LinkedList, PriorityQueue)
    private static void performQueueOperations(Queue<Integer> queue) {
        // Insert (Offer)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("After Offer: " + queue);

        // Delete (Poll)
        queue.poll(); 
        System.out.println("After Poll: " + queue);

        // Traverse using Iterator
        System.out.println("Traverse using Iterator:");
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
