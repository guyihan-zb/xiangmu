//二叉树的深度

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.*;
import java.util.Queue;
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeNode cur = q.poll();
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            count++;
        }
        return count;
    }
}