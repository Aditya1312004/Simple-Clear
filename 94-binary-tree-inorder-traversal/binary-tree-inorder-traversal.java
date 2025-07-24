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
        Stack<TreeNode> po = new Stack<TreeNode>();
        
        TreeNode jh = root;
        while(true){
            if(jh!=null){
                po.push(jh);
                jh = jh.left;


            }
            else{
                if(po.isEmpty()){
                    break;
                }
              jh =   po.pop();
                as.add(jh.val);
                jh = jh.right;
                            }
        }
        return as;
    }
}