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
    public String pre(TreeNode root){
        if(root==null){
            return "null";
        }

        StringBuilder sb  = new StringBuilder("^");
        sb.append(root.val);
        sb.append(pre(root.left));
        sb.append(pre(root.right));

        return  sb.toString();

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        String full = pre(root);
        String sub = pre(subRoot);
        return full.contains(sub);

    }
}