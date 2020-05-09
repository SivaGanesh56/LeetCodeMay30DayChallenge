/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3324/

Given a positive integer num, write a function which returns True if num is a perfect square else False.

*/

//Apporach: Binary Search

class Solution {
    public boolean isPerfectSquare(int num) {
       int low = 1, high = num;
        while (low <= high) {
            long mid = low+(high-low)/2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }

}
