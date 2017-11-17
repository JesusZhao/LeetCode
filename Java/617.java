/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // 以下两个方法均来自官网的Solution
    // 方法一，使用递归
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;// 两个节点都不为空则值相加
        t1.left = mergeTrees(t1.left, t2.left);// 递归merge左子树
        t1.right = mergeTrees(t1.right, t2.right);// 递归merge右子书
        return t1;
    }
    // 方法二，使用迭代
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null){
            return t2;
        }
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{t1, t2});// 先把两个根节点入栈
        while(!stack.isEmpty()) {
            TreeNode[] temp = stack.pop();
            if(temp[0]==null || temp[1]==null){
                continue;
            }
            temp[0].val += temp[1].val;
            if(temp[0].left==null){
                temp[0].left = temp[1].left;
            } else {
                stack.push(new TreeNode[]{temp[0].left, temp[1].left});
            }
            if(temp[0].right==null){
                temp[0].right=temp[1].right;
            } else {
                stack.push(new TreeNode[]{temp[0].right,temp[1].right});
            }
        }
        return t1;
    }
}