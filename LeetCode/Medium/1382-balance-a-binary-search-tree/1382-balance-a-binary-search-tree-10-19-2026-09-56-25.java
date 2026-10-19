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
            List<Integer> sort = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {

        inorder(root);
        return bst(0,sort.size() -1);
    }

    public void inorder(TreeNode root){
        if (root == null){
            return;
             }
        

        inorder(root.left);
        sort.add(root.val);
        inorder(root.right);
        
    }

    public TreeNode bst(int start,int end){
        if(start > end){
            return null;
        }

        int mid = start + (end-start)/2;
        TreeNode node = new TreeNode(sort.get(mid));
        node.left = bst(start,mid-1);
        node.right = bst(mid+1,end);
        return node;
    }


}