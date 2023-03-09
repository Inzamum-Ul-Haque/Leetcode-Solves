package Easy_and_Mixed_Problems;

public class Diameter_of_a_Binary_Tree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int dfs(TreeNode root, int res) {
        if (root == null) {
            return -1;
        }

        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        res = Math.max(res, 2 + left + right);

        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int res = 0;
        dfs(root, res);
        return res;
    }
}
