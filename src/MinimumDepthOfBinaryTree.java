import java.util.LinkedList;
import java.util.Queue;

/**
 * no.111
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
    }

    //层序遍历
    public int minDepthLevel(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode temp,magic = new TreeNode(0);
        queue.add(root);
        queue.add(magic);
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp.equals(magic)){
                if(!queue.isEmpty()){
                    depth++;
                    queue.add(magic);
                }
                continue;
            }
            if(temp.left == null && temp.right == null)
                return depth;
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
        return depth;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
