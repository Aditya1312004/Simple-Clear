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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> po = new ArrayList<>();

        if(root == null) return po;
        Queue<TreeNode> as = new LinkedList<>();
        as.offer(root);
        
        while(!as.isEmpty()){
             int size = as.size();
            List<Integer> mn = new ArrayList<>();

        for(int i= 0;i<size;i++){
           TreeNode gh= as.poll();
            mn.add(gh.val);

            if(gh.left!=null) as.offer(gh.left);
            if(gh.right!=null) as.offer(gh.right);
        }
        po.add(mn);
        }
        return po;
    }
}