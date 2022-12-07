package example;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertNode("a");
        linkedList.insertNode("b");
        linkedList.insertNode("c");

        Node search = linkedList.searchNode("b");
        linkedList.insertNode(search, "d");

        linkedList.printList();

        try {
            linkedList.searchNode("e");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        linkedList.deleteNode("b");
        linkedList.printList();
//        linkedList.deleteNode();
//        linkedList.printList(); //a d
//
//        linkedList.deleteNode(); // a
//        linkedList.deleteNode("a");

        linkedList.reverseList();
        linkedList.printList();

        Queue queue = new Queue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();

        queue.printQueue();
    }
}
