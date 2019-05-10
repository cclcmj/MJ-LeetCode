package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 验证二叉搜索树
给定一个二叉树，判断其是否是一个有效的二叉搜索树。

假设一个二叉搜索树具有如下特征：

节点的左子树只包含小于当前节点的数。
节点的右子树只包含大于当前节点的数。
所有左子树和右子树自身必须也是二叉搜索树。
示例 1:

输入:
    2
   / \
  1   3
输出: true
示例 2:

输入:
    5
   / \
  1   4
     / \
    3   6
输出: false
解释: 输入为: [5,1,4,null,null,3,6]。
     根节点的值为 5 ，但是其右子节点值为 4 。
 */
public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        System.out.println(new App().isValidBST(root));
    }
    public boolean isValidBST(TreeNode root) {
            if(root == null) return false;
            else if(root.left == null && root.right == null)return true;
            List<TreeNode> result = new ArrayList<TreeNode>();
            TreeNode tmp = root;
            Stack<TreeNode> nodes = new Stack<TreeNode>();
            while(tmp != null || !nodes.empty()) {
                while(tmp != null) {
                    nodes.push(tmp);
                    tmp = tmp.left;
                }
                if(!nodes.empty()){
                    tmp = nodes.pop();
                    result.add(tmp);
                    tmp = tmp.right;
                }
            }
            for(int i = 1;i<result.size();i++) {
                if(result.get(i).val < result.get(i-1).val)return false;
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