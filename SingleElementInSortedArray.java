/*

@Author: Siva Ganesh

Problem Link ==>  https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3327/

Description : 

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.

Sample Cases :
    1. Input: [1,1,2,3,3,4,4,8,8]
       Output: 2
     
    2. Input: [3,3,7,7,10,11,11]
       Output: 10
 
 Apporach : Bit Manipulation(Xor)
 
 */
 
 class Solution {
    public int singleNonDuplicate(int[] nums) {
        int val = nums[0];
        for(int i=1;i<nums.length;i++){
            val^=nums[i];
        }
        return val;
    }
}
