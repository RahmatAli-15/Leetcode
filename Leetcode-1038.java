1038. Binary Search Tree to Greater Sum Tree

  // O(N)time
// O(D)space
public TreeNode bstToGst(TreeNode root) {
    dfs(root, 0);
    return root;
}

int dfs(TreeNode node, int count){
    if(node == null) return count;
    int t = dfs(node.right, count);
    node.val += t;
    return dfs(node.left, node.val);
}
