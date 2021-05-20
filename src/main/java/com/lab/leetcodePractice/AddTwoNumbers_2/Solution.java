

//題目來源:https://leetcode.com/problems/add-two-numbers/ 需請教尚未做出

package com.lab.leetcodePractice.AddTwoNumbers_2;

class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode next, int val) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" + "val=" + val + '}';
    }

}

public class Solution {

    public static void main(String[] args) {
        ListNode start = new ListNode(0);
        ListNode curr = start;
        for (int i = 1; i < 10; i++) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        ListNode curr2= start;
        System.out.println(start);
        for (int i = 1; i < 10; i++) {
            System.out.println(curr2.next);
            curr2 = curr2.next;
        }
    }

}
