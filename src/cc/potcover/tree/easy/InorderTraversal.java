package cc.potcover.tree.easy;

import cc.potcover.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalRecur(list, root);

        return list;

    }

    private void inorderTraversalRecur(List<Integer> list, TreeNode root) {
        if (root != null) {
            inorderTraversalRecur(list, root.left);
            list.add(root.val);
            inorderTraversalRecur(list, root.right);
        }
    }

    public List<Integer> inorderTraversalNonRecur(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();

            while (!stack.isEmpty() || root != null){
                if (root != null) {
                    stack.push(root);
                    root = root.left;
                }else {
                    root = stack.pop();
                    res.add(root.val);
                    root = root.right;
                }
            }
        }


        return res;
    }
}
