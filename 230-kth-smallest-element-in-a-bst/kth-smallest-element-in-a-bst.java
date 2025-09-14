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
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> as = new ArrayList<>();
       inorder(root , as);
       return as.get(k-1);
    }
    public void inorder(TreeNode node , List<Integer> as){
        if(node ==null)return;
        inorder(node.left ,as);
        as.add(node.val);
        inorder(node.right , as);
    }
}