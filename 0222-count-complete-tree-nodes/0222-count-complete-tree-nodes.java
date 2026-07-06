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
int cnt =0;

    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return c(root);
    }
    public int c(TreeNode root){
        cnt++;
        if(root==null){
            return 0;
        }

        c(root.left);
        c(root.right);
        return cnt/2;
    }
}