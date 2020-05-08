/*

@Author: Siva Ganesh

problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

*/

class Solution {
    TreeNode xParent;
    TreeNode yParent;
    int xDepth;
    int yDepth;
    int foundNodes = 2;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        isCousinsUtil(root,x,y,null,0);
        if(foundNodes==0 && xDepth==yDepth && xParent!=yParent){
            return true;
        }
        return false;
    }
    
    public void isCousinsUtil(TreeNode root,int x,int y,TreeNode parent,int depth){
        if(root==null || foundNodes==0) return;
        
        if(root.val==x){
            xParent = parent;
            xDepth = depth;
            foundNodes--;
        }
        
        if(root.val==y){
            yParent = parent;
            yDepth = depth;
            foundNodes--;
        }
        
        isCousinsUtil(root.left,x,y,root,depth+1);
        isCousinsUtil(root.right,x,y,root,depth+1);
    }
      
