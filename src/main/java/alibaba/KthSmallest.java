package main.java.alibaba;

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
/*
find out the kth smallest node in a binary search tree (an ordered tree).

sample:
root=[3,1,4,null,2], k=1
result=1

root=[5,3,6,2,4,null,null,1], k=3
result=3

 */
public class KthSmallest {

        public int kthSmallest(TreeNode root, int k) {
            int[] total={0};
            return count(root, total, k).val;
        }

        private TreeNode count(TreeNode root, int[] total, int k){
            if(root==null) return null;
            TreeNode rtn = count(root.left, total, k);
            if(rtn!=null) return rtn;
            else{
                total[0]++;
            }

            if(total[0]==k){
                return root;
            }
            rtn = count(root.right, total,k);
            if(rtn!=null) return rtn;
            return null;
        }
}
