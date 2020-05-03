/*
@Author: Siva Ganesh
Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<jewels.length;i++){
            hs.add(jewels[i]);
        }
        int count = 0;
        for(int i=0;i<stones.length;i++){
            if(hs.contains(stones[i])){
                count++;
            }
        }
        return count;
    }
}
