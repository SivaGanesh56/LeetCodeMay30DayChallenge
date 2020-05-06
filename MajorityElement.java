/*

@Author: Siva Ganesh

problem link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

*/

//Apporach : Morris Voting Algo

class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[index]){
                count++;
            }else{
                count--;
            }
            if(count==0){
            index = i;
            count = 1;
            }
        }
      return nums[index];
    }
}
