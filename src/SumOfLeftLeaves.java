/**
 * No.404
 * Find the sum of all left leaves in a given binary tree.
 *
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        int result=0;
        if(root.left!=null){
            /**
             * 判断是否是叶子节点
             */
            if(root.left.left==null&&root.left.right==null){
                result+=root.left.val;
            }else{
                result +=sumOfLeftLeaves(root.left);
            }
        }
        result+=sumOfLeftLeaves(root.right);
        return result;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
