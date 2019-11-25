package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queues {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.add(5);
        priorityQueue.add(645);
        priorityQueue.add(5);
        priorityQueue.add(676);
        priorityQueue.add(5);


        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.offer(9);
        deque.offer(5);
        deque.offer(1);
        deque.offerFirst(3);
        deque.offerLast(23);
        deque.addFirst(34);
        System.out.println(deque);
    }
}
