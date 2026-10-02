package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {

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

    public static int kthSmallest(TreeNode root, int k, List<Integer> nums) {

        if (root == null) {
            return -1;
        }

        kthSmallest(root.left, k  , nums);
        if (nums.size() == k - 1) {
            return root.val;
        }
        nums.add(root.val);
        System.out.println( root.val);
        kthSmallest(root.right, k , nums);
        return -1;
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        kthSmallest(null, 0, nums);
    }


}
