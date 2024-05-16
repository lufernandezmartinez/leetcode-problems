package java.daily.20240516;

public class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }
        boolean leftEval = evaluateTree(root.left);
        boolean rightEval = evaluateTree(root.right);
        if (root.val == 2) {
            return leftEval || rightEval;
        } else if (root.val == 3) {
            return leftEval && rightEval;
        }
        throw new IllegalArgumentException("Invalid node value: " + root.val);
    }
}
