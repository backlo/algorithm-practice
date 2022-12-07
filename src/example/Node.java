package example;

public class Node {

    private String data;
    private Node link;

    public Node() {
        this.data = null;
        this.link = null;
    }

    public Node(String data) {
        this.data = data;
        this.link = null;
    }

    public Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
