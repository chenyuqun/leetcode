/**
 * No 104.
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Subscribe to see which companies asked this question.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaximumDepthBinaryTree {
    public static int maxDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }else{
            return 1+Math.max(maxDepth(root.getLeft()),maxDepth(root.getRight()));
        }
    }

    public class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
