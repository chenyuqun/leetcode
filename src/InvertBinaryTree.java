/**
 * No 226
 * Invert a binary tree.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        TreeNode change=root.getRight();
        //这一步骤有次序
        root.setRight(invertTree(root.getLeft()));
        root.setLeft(invertTree(change));
        return root;
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
