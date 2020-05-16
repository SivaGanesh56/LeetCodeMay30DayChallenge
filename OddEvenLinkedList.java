/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3331/

Description: Given a singly linked list, group all odd nodes together followed by the even nodes.
             Please note here we are talking about the node number and not the value in the nodes.
         
Sample Cases: 
         1. Input: 1->2->3->4->5->NULL
            Output: 1->3->5->2->4->NULL
           
         2. Input: 2->1->3->5->6->4->7->NULL
            Output: 2->3->6->7->1->5->4->NULL
            
Apporach : Two Pointers 


*/


class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode odd = head;
        ListNode holder = head.next;
        ListNode even = holder;
        while( even!=null && even.next!=null){
            odd.next = even.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = holder;
        return head;
    }
}


            
