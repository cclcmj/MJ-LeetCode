package app;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的最大深度
 * 
 *给定一个二叉树，找出其最大深度。
 *二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *说明: 叶子节点是指没有子节点的节点。
 *
 *示例： 
 *给定二叉树 [3,9,20,null,null,15,7]，
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 *返回它的最大深度 3 。
 */
public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = TreeNode.createTree();
        System.out.println(new App().maxDepth(root));
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int int_right = maxDepth(root.right);
        int int_left = maxDepth(root.left);
        return Math.max(int_right, int_left)+1;
    }
}
/**
 * TreeNode
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    static TreeNode createTree() {
        TreeNode r = new TreeNode(0);
        TreeNode tmp = r;
        for(int i = 1;i < 8;i++) {
            if(i % 2 == 0) {
                tmp.left = new TreeNode(i);
                tmp = tmp.left;
            }
            else {
                tmp.right = new TreeNode(i);
                tmp = tmp.right;
            }
        }
        return r;
    }
    static void printTree(TreeNode r) {
        if(r == null) return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(r);
        TreeNode tmp = r;
        while(!q.isEmpty()) {
            tmp = q.poll();
            System.out.print(tmp.val+",");
            if(tmp.left != null)q.add(tmp.left);
            if(tmp.right != null)q.add(tmp.right);
        }
    }
}