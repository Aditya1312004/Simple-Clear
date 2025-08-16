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
     int count = 0;
    public int goodNodes(TreeNode root) {
        
        good(root , root.val);
       

        return count;
    }
    public void good(TreeNode node , int max){
        if(node == null)return ;
        if(node.val >= max){
            count+=1;
        }
        max = Math.max(max , node.val);



        good(node.left , max);
        good(node.right , max);
    }
}