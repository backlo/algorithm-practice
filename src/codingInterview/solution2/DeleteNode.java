package codingInterview.solution2;

public class DeleteNode {

    private void deleteNode(LinkedListNode head, int x) {
        LinkedListNode p1 = head;

        for (int i = 0; i < x; i++) {
            if (p1.link == null) return;
            p1 = p1.link;
        }

        while (p1 != null) {
            p1 = p1.link;
            head = head.link;
        }

        LinkedListNode tempNode = head.link;
        head.data = tempNode.data;
        head.link = tempNode.link;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(10);
        list.add(2);
        list.printList();
        DeleteNode solution2_2 = new DeleteNode();
        solution2_2.deleteNode(list.getHead(), 2);
        list.printList();

    }

}
