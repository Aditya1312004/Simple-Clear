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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> po = new ArrayList<Integer>();
        List<Integer> po2 = new ArrayList<Integer>();

        check(root1 , po);
        check(root2 , po2);

        return po.equals(po2);

    }
    public void check(TreeNode root , List<Integer> as ){
        if(root!=null){
            if(root.left ==null && root.right == null){
                as.add(root.val);
            }
            else{
            check(root.left , as);
            check(root.right , as);
        }
        }
        
        
    }
}