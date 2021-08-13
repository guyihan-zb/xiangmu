
//二叉树的镜像

public TreeNode Mirror(TreeNode root) {
    //如果为空直接返回
    if (root == null)
        return null;
    //队列
    final Queue<TreeNode> queue = new LinkedList<>();
    //首先把根节点加入到队列中
    queue.add(root);
    while (!queue.isEmpty()) {
        //poll方法相当于移除队列头部的元素
        TreeNode node = queue.poll();
        //交换node节点的两个子节点
        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;
        //如果当前节点的左子树不为空，就把左子树
        //节点加入到队列中
        if (node.left != null) {
            queue.add(node.left);
        }
        //如果当前节点的右子树不为空，就把右子树
        //节点加入到队列中
        if (node.right != null) {
            queue.add(node.right);
        }
    }
    return root;
}