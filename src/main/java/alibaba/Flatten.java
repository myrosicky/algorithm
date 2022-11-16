package main.java.alibaba;

/*
given a root node of tree "root", pls convert to single link list. which means only right node connected to the next value and the left node is null
input: root=[1,2,5,3,4,null,6]
output: [1,null,2,null,3,null,4,null,5,null,6]

input: root=[]
output: []

input: root=[0]
output: [0]
 */
public class Flatten {

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
        public void flatten(TreeNode root) {
            c(root);
        }

        public void c(TreeNode node){
            if(node==null) return;
            c(node.left);
            c(node.right);
            if(node.left != null){
                TreeNode tmp = node.left;
                while(tmp.right!=null){
                    tmp=tmp.right;
                }

                tmp.right=node.right;

                node.right=node.left;
                node.left=null;
            }
        }
}
