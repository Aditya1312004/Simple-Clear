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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> as = new ArrayList<>();
        inorder(as , root);
    return as;
    }

        public void inorder(List<Integer> as ,TreeNode root){
            if(root == null){
                return ;
            }
            inorder(as ,root.left );
            as.add(root.val);
            inorder(as , root.right);
        }
    }
