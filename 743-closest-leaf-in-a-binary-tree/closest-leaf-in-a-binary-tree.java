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
class Solution {
    public int findClosestLeaf(TreeNode root, int k) {
        Map<TreeNode, List<TreeNode>> tree = new HashMap<>();

        dfs(tree,root,null);

        Queue<TreeNode> treQueue = new LinkedList<>();
        Set<TreeNode> seen = new HashSet<>();

        for(TreeNode r: tree.keySet()){
            if(r!=null && r.val==k){
                treQueue.add(r);
                seen.add(r);
            }
        }

        while(!treQueue.isEmpty()){
            TreeNode cur = treQueue.poll();
            if(cur!=null){
                if(tree.get(cur).size()<=1){
                    return cur.val;
                }

                for(TreeNode next : tree.get(cur)){
                    if(!seen.contains(next)){
                        seen.add(next);
                        treQueue.add(next);
                    }
                }
            }
        }
        throw null;
    }

    private static void dfs(Map<TreeNode, List<TreeNode>> tree,TreeNode root, TreeNode parent){
        if(root!=null){
            if(!tree.containsKey(root)){
                tree.put(root, new LinkedList<TreeNode>());
            }
            if(!tree.containsKey(parent)){
                tree.put(parent, new LinkedList<TreeNode>());
            }
            tree.get(root).add(parent);
            tree.get(parent).add(root);

            dfs(tree,root.left,root);
            dfs(tree,root.right,root);
        }

    }
}