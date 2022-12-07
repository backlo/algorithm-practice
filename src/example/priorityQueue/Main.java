package example.priorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Number> priorityQueue = new PriorityQueue<Number>(6);

        priorityQueue.enqueue('a');
        priorityQueue.enqueue('c');
        priorityQueue.enqueue('b');
        priorityQueue.enqueue('e');
        priorityQueue.enqueue('d');

        priorityQueue.printQueue();

        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());

        priorityQueue.printQueue();

    }
}
