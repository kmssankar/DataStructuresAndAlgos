package Trees;

class TreeNode {
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

public class MaxDepth {

    public static void main(String[] args) {
        
    }


    private int DepthFirstSearch(TreeNode n){

        if(n == null){
            return 0;
        }else{
            int leftDepth =  DepthFirstSearch(n.left) + 1;
            int rightDepth = DepthFirstSearch(n.right) + 1;
            return Math.max(leftDepth,rightDepth);
        }
    }


}
