package codingInterview.solution2;

public class Solution2_2 {

    public LinkedListNode findNode(LinkedListNode head, int n) {
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        for (int i = 0; i < n; i++) {
            if (p1.link == null) return null;
            p1 = p1.link;
        }

        while (p1 != null) {
            p1 = p1.link;
            p2 = p2.link;
        }

        return p2;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(9);
        list.add(10);
        list.add(2);

        Solution2_2 solution2_2 = new Solution2_2();
        System.out.println(solution2_2.findNode(list.getHead(), 2).data);

    }
}
