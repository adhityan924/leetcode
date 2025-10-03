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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lcaNode = findLca(root, startValue, destValue);

        StringBuilder pathStart = new StringBuilder();
        findPath(lcaNode, startValue, pathStart);
        StringBuilder pathDest = new StringBuilder();
        findPath(lcaNode, destValue, pathDest);

        StringBuilder direction = new StringBuilder();

        for(int i=0;i<pathStart.length();i++){
            direction.append('U');
        }
        direction.append(pathDest);

        return direction.toString();

    }

    private static TreeNode findLca(TreeNode root, int startValue, int destValue){
        if(root==null){
            return null;
        }

        if(root.val==startValue||root.val==destValue){
            return root;
        }

        TreeNode lLca = findLca(root.left, startValue, destValue);
        TreeNode rRca = findLca(root.right, startValue, destValue);

        if(lLca==null){
            return rRca;
        } else if (rRca==null){
            return lLca;
        } else {
            return root;
        }

    }

    private boolean findPath(TreeNode root, int target, StringBuilder path){
        if(root==null){
            return false;
        }

        if(root.val==target){
            return true;
        }

        path.append('L');
        if(findPath(root.left, target, path)){
            return true;
        }
        path.setLength(path.length()-1);

        path.append('R');
        if(findPath(root.right, target, path)){
            return true;
        }
        path.setLength(path.length()-1);


        return false;

    }
}