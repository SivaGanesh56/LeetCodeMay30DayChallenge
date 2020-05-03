/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3318/

Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note

*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[26];
        for(Character ch : magazine.toCharArray()){
            ++a[ch-97];
        }
        for(Character ch : ransomNote.toCharArray()){
            if(--a[ch-97]<0) return false;
        }
        return true;
    }
}
