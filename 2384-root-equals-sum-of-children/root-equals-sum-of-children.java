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
    public boolean checkTree(TreeNode root) {
        TreeNode leftChild = root.left;
        int leftVal = leftChild.val;

        TreeNode rightChild = root.right;
        int rightVal = rightChild.val;

        if ((leftVal + rightVal) == root.val)
        return true;
        else 
        return false;
    }
}