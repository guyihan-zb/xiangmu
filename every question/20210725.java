//二叉搜索树与双向链表


//递归调用 左 根 右 遍历
public class Solution {
     //双向链表的左边头结点和右边头节点
    TreeNode leftHead = null;
    TreeNode rightHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
         //递归调用叶子节点的左右节点返回null
        if(pRootOfTree==null) return null;
          //第一次运行时，它会使最左边叶子节点为链表第一个节点
        Convert(pRootOfTree.left);
        if(rightHead==null){
            leftHead= rightHead = pRootOfTree;
        }else{
            //把根节点插入到双向链表右边，rightHead向后移动
           rightHead.right = pRootOfTree;
           pRootOfTree.left = rightHead;
           rightHead = pRootOfTree;
        }
         //把右叶子节点也插入到双向链表（rightHead已确定，直接插入）
        Convert(pRootOfTree.right);
         //返回左边头结点
        return leftHead;
    }
}


/** 递归：中序遍历 右 中 左 */
public class Solution {
    TreeNode list = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return pRootOfTree;
        
        Convert(pRootOfTree.right);
        if(list == null){
            list = pRootOfTree;
        } else {
            list.left = pRootOfTree;
            pRootOfTree.right = list;
            list = pRootOfTree;
        }
        Convert(pRootOfTree.left);
        
        return list;
    }
}


/** 非递归 */
import java.util.Stack;
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return pRootOfTree;
        
        TreeNode list = null;
        Stack<TreeNode> s = new Stack<>();
        while(pRootOfTree != null || !s.isEmpty()){
            if(pRootOfTree != null) {
                s.push(pRootOfTree);
                pRootOfTree = pRootOfTree.right;
            } else {
                pRootOfTree = s.pop();
                if(list == null)
                    list = pRootOfTree;
                else {
                    list.left = pRootOfTree;
                    pRootOfTree.right = list;
                    list = pRootOfTree;
                }
                pRootOfTree = pRootOfTree.left;
            }
        }
        
        return list;
    }
}
}