package codingInterview.solution2;

public class Solution2_4 {

    private LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode head = node;
        LinkedListNode tail = node;

        while (node != null) {
            LinkedListNode next = node.link;
            if (node.data < x) {
                node.link = head;
                head = node;
            } else {
                tail.link = node;
                tail = node;
            }
            node = next;
        }
        tail.link = null;

        return head;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);

        CustomLinkedList list1 = new CustomLinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(6);
        list1.add(4);
        list1.add(4);
        list1.add(2);
        list1.add(5);
        list1.add(7);

        Solution2_4 solution2_4 = new Solution2_4();
        LinkedListNode listNode = solution2_4.partition(list.getHead(), 5);
        while (listNode != null) {
            System.out.print(listNode.data + " ");
            listNode = listNode.link;
        }
        System.out.println();

        LinkedListNode listNode1 = solution2_4.partition(list1.getHead(), 1);
        while (listNode1 != null) {
            System.out.print(listNode1.data + " ");
            listNode1 = listNode1.link;
        }
    }
}
