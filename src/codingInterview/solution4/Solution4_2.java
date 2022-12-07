package codingInterview.solution4;

public class Solution4_2 {

    public TreeNode createMinimalBst(int[] arr) {
        return createMinimalBst(arr, 0, arr.length - 1);
    }

    private TreeNode createMinimalBst(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(mid);

        n.left = createMinimalBst(arr, start, mid - 1);
        n.right = createMinimalBst(arr, mid + 1, end);
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Solution4_2 solution4_2 = new Solution4_2();
        TreeNode n = solution4_2.createMinimalBst(arr);

        n.printNode();
    }
}
