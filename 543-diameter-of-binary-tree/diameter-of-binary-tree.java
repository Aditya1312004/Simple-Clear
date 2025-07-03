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
   
        



    int res = 0;
    public int treeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);
         res = Math.max(res, lh+rh);

        return Math.max(lh,rh)+1;
    }

     public int diameterOfBinaryTree(TreeNode root) {
    
        treeHeight(root);
        return res;

    }
}
   