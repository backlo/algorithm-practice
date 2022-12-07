package codingInterview.solution2;

public class Solution2_5 {

    private LinkedListNode addList(LinkedListNode l1, LinkedListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        LinkedListNode result = new LinkedListNode();
        int value = carry;

        if (l1 != null) {
            value += l1.data;
        }
        if (l2 != null) {
            value += l2.data;
        }

        result.data = value % 10;

        if (l1 != null || l2 != null) {
            result.link = addList(l1 == null ? null : l1.link,
                    l2 == null ? null : l2.link,
                    value <= 10 ? 0 : 1);
        }

        return result;
    }

    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        list1.add(3);
        list1.add(5);
        list1.add(8);

        CustomLinkedList list2 = new CustomLinkedList();
        list2.add(2);
        list2.add(1);
        list2.add(9);

        Solution2_5 solution2_5 = new Solution2_5();
        LinkedListNode listNode = solution2_5.addList(list1.getHead(), list2.getHead(), 0);
        while (listNode != null) {
            System.out.print(listNode.data + " ");
            listNode = listNode.link;
        }
    }
}
