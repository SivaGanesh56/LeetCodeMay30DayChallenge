/*

@Author: Siva Ganesh

problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

*/

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        int a = getDepth(root,x,0);
        int b = getDepth(root,y,0);
        System.out.println(a+" "+b);
        if((a==0 && b==0) || a!=b){
            return false;
        }
        return helper(root,x,y);
    }
    
    public boolean helper(TreeNode root,int x,int y){
        if(root==null) return false;
        if(root.left!=null && root.right!=null){
            if( (root.left.val==x && root.right.val==y) || (root.left.val==y && root.right.val==x) ){
                return false;
            }
        }
        if(root.val==x || root.val==y){
            return true;
        }
        return helper(root.left,x,y) || helper(root.right,x,y);
    }
    
    public int getDepth(TreeNode root,int x,int depth){
        if(root==null) return 0;
        if(root.val==x){
            return depth;
        }
        int value = getDepth(root.left,x,depth+1);
        return value!=0?value:getDepth(root.right,x,depth+1);
    }
    
}
