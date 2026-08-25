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
    int maxval=0;
    Integer prev=null;
    public int helper(TreeNode root)
    {
        if(root==null) return 0;
        int leftm=helper(root.left);
        int rightm=helper(root.right);

        int maxRL=Math.max(leftm, rightm);
        int maxN=Math.max(root.val, (root.val+maxRL));
        int maxAll=Math.max(maxN,leftm+rightm+root.val);

        maxval=Math.max(maxval,maxAll);

        return maxN;


    }

    public int maxPathSum(TreeNode root) {
        maxval=Integer.MIN_VALUE;
         helper(root);

        return maxval;

    }
}