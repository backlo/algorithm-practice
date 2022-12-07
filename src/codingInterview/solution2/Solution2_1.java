package codingInterview.solution2;

public class Solution2_1 {

    public void deleteDups(LinkedListNode head) {
        LinkedListNode current = head;

        while (current != null) {
            LinkedListNode tempNode = current;
            while (tempNode.link != null) {
                if (tempNode.link.data == current.data) {
                    tempNode.link = tempNode.link.link;
                    continue;
                }
                tempNode = tempNode.link;
            }
            current = current.link;
        }

    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        list.printList();

        Solution2_1 solution2_1 = new Solution2_1();
        solution2_1.deleteDups(list.getHead());

        list.printList();
    }
}
