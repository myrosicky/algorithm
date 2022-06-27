package main.java.alibaba;
/*
given a root of binary tree "root", summary all the path from root to leaf in any order.

leaf node: node without child node.

sample1:
input：root = [1,2,3,null,5]
output：["1->2->5","1->3"]

sample2:
input：root = [1]
output：["1"]
 */
public class BinaryTree {
    public List binaryTreePaths(TreeNode root) {
        List paths = new ArrayList<>();
        trav(root, root.val + "", paths);
        return paths;
    }

    private void trav(TreeNode node, String path, List paths){
        if(node.left == null && node.right==null){
            paths.add(path);
        }else{
            if(node.left != null){
                trav(node.left, path + "->" + node.left.val, paths);
            }
            if(node.right != null){
                trav(node.right, path + "->" + node.right.val, paths);
            }
        }
    }
}
