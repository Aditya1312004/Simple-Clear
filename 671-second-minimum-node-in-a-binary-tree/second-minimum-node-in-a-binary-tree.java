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
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        inorder(root,pq);
        pq.poll();
        return pq.peek() != null ? pq.peek() : -1;

    }
    public void inorder(TreeNode root, PriorityQueue<Integer> pq){
        if(root == null){
            return;
        }
        inorder(root.left , pq);
        if(!pq.contains(root.val)){
            pq.add(root.val);
        }
        inorder(root.right,pq);
    }
}