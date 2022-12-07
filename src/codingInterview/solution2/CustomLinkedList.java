package codingInterview.solution2;

public class CustomLinkedList {
    private LinkedListNode head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (head == null) {
            this.head = newNode;
            return;
        }

        LinkedListNode temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }

    public void printList() {
        LinkedListNode tempNode = head;

        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.link;
        }

        System.out.println();
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void empty() {
        head = null;
    }
}
