package main.java.alibaba;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/*
given 2 binary trees root and subRoot. verify if root contains a sub tree which has the same structure and nodes as subRoot. if so return true, otherwise false.
the sub tree of a binary tree is composed of a node and all the child nodes.

sample1
input: root = [3,4,5,1,2], subRoot = [4,1,2]
output: true

sample2
input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
output: false
 */

public class isSubtree {



    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return recur(root, subRoot, false);
    }

    private boolean recur(TreeNode root, TreeNode subRoot, boolean pre){
        if(root == null && subRoot!=null || root != null && subRoot==null){ return false;
        }
        if(pre && root == null && subRoot==null){
            return true;
        }

        if(root.val == subRoot.val){
            boolean tmp = recur(root.left,subRoot.left, true)
                    && recur(root.right,subRoot.right, true);
            if(tmp){
                return true;
            }
        }
        if(pre){
            return false;
        }
        return recur(root.left,subRoot, false) ||  recur(root.right,subRoot, false);
    }
}
