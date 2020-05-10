/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3325/

In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.


*/


class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0) return 1;
        int[] a = new int[n+1];
        for(int[] arr : trust){
            a[arr[0]] = -1;
            if(a[arr[1]]!=-1){
                ++a[arr[1]];
            }
        }
        for(int i=1;i<=n;i++){
            if(a[i]==n-1) return i;
        }
        return -1;
    }
}
