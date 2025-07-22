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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> as = new ArrayList<>();
        Stack<TreeNode> po = new Stack<>();

        if(root ==null ) return as;
        po.push(root);
        while(!po.isEmpty()){
            root = po.pop();
            as.add(root.val);
            if(root.right!=null){
                po.push(root.right);
            }
            if(root.left!=null){
                po.push(root.left);
            }
        }
    return as;
    }
}