/**
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
class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;

        return nodes(root,0);
    }

    private int nodes(TreeNode node, int sum) {
        if (node == null)
            return 0;

        sum = sum * 10 + node.val;

        if (node.left == null & node.right == null)
            return sum;

        return nodes(node.left, sum) + nodes(node.right, sum);
    }
}