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
    HashMap<Integer,Integer> map = new HashMap<>();
    void dfs(TreeNode node){
        if(node == null){
            return;
        }

        map.put(node.val,map.getOrDefault(node.val,0)+1);
        
        
        dfs(node.left);
        dfs(node.right);
    }
    public int[] findMode(TreeNode root) {
        
        dfs(root);
    int maxfreq = 0;
        for(int key : map.keySet()){
            maxfreq = Math.max(maxfreq,map.get(key));
        }
        // list create whos have the maxfreq elements 
        ArrayList<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == maxfreq){
                list.add(key);
            }
        }

        int ans[] = new int[list.size()];
        for(int i = 0; i < list.size() ; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}