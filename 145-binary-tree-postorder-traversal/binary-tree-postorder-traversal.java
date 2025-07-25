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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> as = new ArrayList<>();
        post(as , root);
        return as;
    }
    public void post(List<Integer> as , TreeNode root){
        
        if(root == null){
            return;
        }
        post(as , root.left);
        post(as , root.right);
        as.add(root.val);
        }
    }
