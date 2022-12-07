package codingInterview.solution4;

public class TreeNode {
    int index;
    TreeNode left;
    TreeNode right;

    public TreeNode(int index) {
        this.index = index;
    }

    public void printNode() {
        System.out.print(index + " ");
        if (left != null) {
            printNode(left);
        }
        if (right != null) {
            printNode(right);
        }
    }

    private void printNode(TreeNode n) {
        System.out.print(n.index + " ");
        if (n.left != null) {
            printNode(n.left);
        }
        if (n.right != null) {
            printNode(n.right);
        }
    }

}
