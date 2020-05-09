/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3324/

Given a positive integer num, write a function which returns True if num is a perfect square else False.

*/

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=1) return true;
        for(int i=2;i<=num/2;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}
