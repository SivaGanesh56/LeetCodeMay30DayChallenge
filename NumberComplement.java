/*
@Author: Siva Ganesh

problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/

Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

*/

class Solution {
    public int findComplement(int n) {
        if(n==0 || n==1) return 1-n;
        int res = 0;
        int c =0;
        while(n!=0){
             res+=(n%2==1)?0:Math.pow(2,c);
             c++;
             n/=2;
         }
         return res;
    }
}
