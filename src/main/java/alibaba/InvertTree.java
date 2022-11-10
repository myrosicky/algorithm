package main.java.alibaba;

/*
invert the tree.
sample:
[4,2,7,1,3,6,9] -> [4,7,2,9,6,3,1]
[2,1,3] -> [2,3,1]
[] -> []
 */
public class InvertTree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
        public TreeNode invertTree(TreeNode root) {
            iv(root);
            return root;
        }

        public void iv(TreeNode node){
            if(node==null) return;
            TreeNode tmp = node.left;
            node.left=node.right;
            node.right=tmp;
            iv(node.left);
            iv(node.right);
        }
}
