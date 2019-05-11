package app;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 对称二叉树
给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3
说明:

如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 */
public class App {
    public static void main(String[] args) throws Exception {

    }
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode tmp1 = root;
        TreeNode tmp2 = root;
        q.offer(tmp1);
        q.offer(tmp2);
        while(!q.isEmpty()) {
            tmp1 = q.poll();
            tmp2 = q.poll();
            if(tmp1 == null && tmp2 == null)continue;
            else if(tmp1 == null || tmp2 == null) return false; 
            if(tmp1.val != tmp2.val) return false;
            q.offer(tmp1.left);
            q.offer(tmp2.right);
            q.offer(tmp1.right);
            q.offer(tmp2.left);
        }
        return true;
    }
}
/**
 * TreeNode
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
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
    static void createTree(int[] vals) {
        TreeNode r = new TreeNode(vals[0]);
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