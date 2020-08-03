/** 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        TreeNode head = helper(nums,low,high);
        return head;
    }
    public TreeNode helper(int[] arr,int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = helper(arr,low,mid-1);
        node.right = helper(arr,mid+1,high);

        return node;
    }
}
