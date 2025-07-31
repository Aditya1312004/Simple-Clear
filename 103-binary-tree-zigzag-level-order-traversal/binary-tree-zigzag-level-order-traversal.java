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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q1 = new LinkedList<>();

        q1.add(root);
        int flag = 1;
        while(!q1.isEmpty()){
            List<Integer> po = new ArrayList<>();
            int s = q1.size();
            for(int i=0;i<s;i++){
            TreeNode curr = q1.remove();
            po.add(curr.val);
            if(curr.right!=null){
                q1.add(curr.right);
            }
            if(curr.left!=null){
                q1.add(curr.left);
            }
            }
            if(flag==1){
                Collections.reverse(po);
                flag = 0;
            }
            else{
                flag = 1;
             
            }
               result.add(po);
            
        }
        return result;
    }
}