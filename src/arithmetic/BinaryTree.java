package arithmetic;



public class BinaryTree {
    public int flag = 0, flag1 = 0, flag2 = 0;
    public int[][] threeOrders (TreeNode root) {
        int[][] nums = new int[3][getRootSize(root)];
        setNums(nums,root);
        return nums;
    }

    private void setNums(int[][] nums, TreeNode root) {
        if (root == null){
            return;
        }
        nums[0][flag++] = root.val;
        setNums(nums,root.left);
        nums[1][flag1++] = root.val;
        setNums(nums,root.right);
        nums[2][flag2++] = root.val;


    }

    public int getRootSize(TreeNode root){
        if (root == null){
            return 0;
        }else {
            return 1 + getRootSize(root.left) + getRootSize(root.right);
        }
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}
