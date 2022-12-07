package codingInterview.solution2;

public class Solution2_3 {

    private boolean deleteNode(CustomLinkedList list, LinkedListNode head, int x) {
        if (head == null) {
            return false;
        }

        LinkedListNode currentNode = head;

        if (x == currentNode.data) {
            if (currentNode.link == null) {
                list.empty();
            } else {
                currentNode.data = currentNode.link.data;
                currentNode.link = currentNode.link.link;
            }
            return true;
        }

        LinkedListNode nextNode = currentNode.link;

        while (nextNode != null) {
            if (nextNode.data == x) {
                if (nextNode.link == null) {
                    currentNode.link = null;
                } else {
                    currentNode.link = nextNode.link;
                    nextNode.link = null;
                }
                return true;
            }
            currentNode = nextNode;
            nextNode = nextNode.link;
        }

        return false;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(4);

        Solution2_3 solution2_3 = new Solution2_3();
        System.out.println(solution2_3.deleteNode(list, list.getHead(), 1));
        System.out.println(solution2_3.deleteNode(list, list.getHead(), 1));
        list.printList();
        System.out.println(solution2_3.deleteNode(list, list.getHead(), 4));
        list.printList();
        System.out.println(solution2_3.deleteNode(list, list.getHead(), 6));
        list.printList();
        System.out.println(solution2_3.deleteNode(list, list.getHead(), 4));
        list.printList();
        System.out.println(solution2_3.deleteNode(list, list.getHead(), 3));
        list.printList();
        System.out.println(solution2_3.deleteNode(list, list.getHead(), 3));
    }
}
