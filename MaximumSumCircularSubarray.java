/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3330/

Description: Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.

Sample cases:
        1. Input: [1,-2,3,-2]
           Output: 3
        2. Input: [5,-3,5]
           Output: 10
        3. Input: [-2,-3,-1]
           Output: -1

Apporach: Kadane's Algorithm with some tweak

*/


class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int curr1=0,curr2=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,total=0;
        for(int i=0;i<arr.length;i++){
            curr1+=arr[i];
            max = Math.max(max,curr1);
            curr1 = Math.max(curr1,0);
            
            curr2+=arr[i];
            min = Math.min(min,curr2);
            curr2 = Math.min(curr2,0);
            
            total+=arr[i];
        }
        
        return max<0? max: Math.max(max,total-min);
    }
}



