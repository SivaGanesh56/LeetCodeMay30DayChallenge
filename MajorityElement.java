/*

@Author: Siva Ganesh

problem link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

*/

class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                val++;
                map.put(nums[i], val);
            }else{
            	map.put(nums[i],1);
            }
	     }
        for(int i=0;i<=n/2;i++){
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}
