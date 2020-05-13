/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3328/

Description:
   Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

Sample Cases:
    1. Input: num = "1432219", k = 3
       Output: "1219"
    2. Input: num = "10200", k = 1
       Output: "200"
       
Apporach: Greedy Algorithm

*/


class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        //Corner Case 1
        if(n==k) return "0";
        Stack<Character> stack = new Stack();
        int i = 0;
        while(i<n){
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        
        //Corner Case 2
        while(k>0){
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char ch = stack.pop();
            sb.append(ch);
        }
        
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
        
    }
}
