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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> as = new ArrayList<>();
       if(root == null){
        return as;
       }
       Queue<TreeNode> po = new LinkedList<>();
       po.add(root);
       while(!po.isEmpty()){
        int n = po.size();
        for(int i = 0;i<n;i++){
        TreeNode curr = po.poll();
        if(i==n-1){
            as.add(curr.val);
        }
        if(curr.left!=null){
            po.add(curr.left);

        }
        if(curr.right!=null){
            po.add(curr.right);
        }
        }
       }
       return as;
    }
}