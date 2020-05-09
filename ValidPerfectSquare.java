/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3324/

Given a positive integer num, write a function which returns True if num is a perfect square else False.

*/

/*
 Apporach : 
    1 -> 1
    4 -> 1+3
    9 -> 1+3+5
    16-> 1+3+5+7
    25-> 1+3+5+7+9
 
*/


class Solution {
    public boolean isPerfectSquare(int n) {
        int i = 1;
        while(n>0){
            n-=i;
            i+=2;
        }
        return n==0;
    }

}
