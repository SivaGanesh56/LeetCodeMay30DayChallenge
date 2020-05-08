/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3323/

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2) return true;
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        if(x1==x2){
            return false;
        }
        int m = (y2-y1)/(x2-x1);
        int c = y1-m*x1;
        for(int i=2;i<coordinates.length;i++){
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if(y!=(m*x)+c){
                return false;
            }
        }
        return true;
    }
}
