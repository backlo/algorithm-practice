package example;

public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertNode(String data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node tempNode = head;

        while (tempNode.getLink() != null) {
            tempNode = tempNode.getLink();
        }

        tempNode.setLink(newNode);
    }

    public void insertNode(Node preNode, String data) {
        Node newNode = new Node(data);

        newNode.setLink(preNode.getLink());
        preNode.setLink(newNode);
    }

    public Node searchNode(String data) {
        Node tempNode = head;

        while (tempNode.getLink() != null) {
            if (data.equals(tempNode.getData())) {
                return tempNode;
            }
            tempNode = tempNode.getLink();
        }

        throw new IllegalArgumentException("찾는 데이터가 없습니다.");
    }

    public void deleteNode(String data) {
        if (head == null) {
            throw new IllegalArgumentException("빈 리스트 입니다.");
        }

        Node preNode = head;

        if (data.equals(preNode.getData())) {
            head = preNode.getLink();
            preNode.setLink(null);
            return;
        }

        Node nextNode = preNode.getLink();

        while (nextNode != null) {
            if (data.equals(nextNode.getData())) {
                if (nextNode.getLink() == null) {
                    preNode.setLink(null);
                } else {
                    preNode.setLink(nextNode.getLink());
                    nextNode.setLink(null);
                }
                break;
            }
            preNode = nextNode;
            nextNode = nextNode.getLink();
        }
    }

    public void deleteNode() {
        if (head == null) {
            throw new IllegalArgumentException("빈 리스트 입니다.");
        }
        if (head.getLink() == null) {
            head = null;
            return;
        }

        Node preNode = head;
        Node nextNode = preNode.getLink();

        while (nextNode.getLink() != null) {
            preNode = nextNode;
            nextNode = nextNode.getLink();
        }

        preNode.setLink(null);
    }

    public void reverseList() {
        Node preNode = null;
        Node currentNode = null;
        Node nextNode = head;

        while (nextNode != null) {
            preNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.getLink();

            currentNode.setLink(preNode);
        }

        this.head = currentNode;
    }

    public void printList() {
        Node tempNode = head;

        while (tempNode != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.getLink();
        }

        System.out.println();
    }
}
