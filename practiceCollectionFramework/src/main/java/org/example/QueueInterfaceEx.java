package org.example;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueInterfaceEx {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(10);
        priorityQueue.add(50);
        priorityQueue.offer(40);


        // Print the elements in the priority queue
        System.out.println("Priority Queue: " + priorityQueue);

        // Peek the element with the highest priority (minimum value)
        System.out.println("Peek: " + priorityQueue.peek());

        // Remove and print elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Poll: " + priorityQueue.poll());
        }

        // Create an ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Add elements to the front of the deque
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(1);

        // Add elements to the end of the deque
        arrayDeque.addLast(4);
        arrayDeque.addLast(5);

        // Display the contents of the deque
        System.out.println("ArrayDeque: " + arrayDeque);

        // Remove elements from the front and end of the deque
        System.out.println("Removed First: " + arrayDeque.removeFirst());
        System.out.println("Removed Last: " + arrayDeque.removeLast());

        // Display the contents of the deque after removal
        System.out.println("ArrayDeque after removal: " + arrayDeque);

    }
}
