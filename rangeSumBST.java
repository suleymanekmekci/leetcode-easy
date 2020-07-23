
/**
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 *
 * The binary search tree is guaranteed to have unique values.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 * Output: 32
 * Example 2:
 *
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * Output: 23
 */
class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void findTotal(int L, int R) {
        if (left != null) {
            left.findTotal(L,R);
        }
        if (val >= L && val <= R) {
            rangeSumBST.total += val;
        }
        if (right != null) {
            right.findTotal(L,R);
        }


    }

}

class rangeSumBST {
    public static int total = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {


        rangeSumBST.total = 0;
        root.findTotal(L,R);


        return rangeSumBST.total;
    }
}
