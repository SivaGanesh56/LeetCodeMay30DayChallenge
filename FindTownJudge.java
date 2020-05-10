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
        boolean[] visited = new boolean[n+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<trust.length;i++){
            int a = trust[i][0];
            int b = trust[i][1];
            visited[a] = true;
            if(!visited[b]){
                if(map.containsKey(b)){
                    map.put(b,map.get(b)+1);
                }else{
                    map.put(b,1);
                }
            }
        }
        
        for(int i=1;i<=n;i++){
            if(!visited[i] && map.containsKey(i) && map.get(i)==n-1){
                return i;
            }
        }
        return -1;
    }
}
