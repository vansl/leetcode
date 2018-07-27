package problem2_add_two_numbers;

/**
 * @author: vansl
 * @create: 18-7-24 下午7:54
 */


import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String sNum1 = "";
        String sNum2 = "";
        while (l1!=null){
            sNum1 = String.valueOf(l1.val) + sNum1;
            l1 = l1.next;
        }
        while (l2!=null){
            sNum2 = String.valueOf(l2.val) + sNum2;
            l2 = l2.next;
        }
        BigInteger num1 = new BigInteger(sNum1);
        BigInteger num2 = new BigInteger(sNum2);
        BigInteger sum = num1.add(num2);
        String sSum = sum.toString();
        ListNode current = new ListNode(sSum.charAt(sSum.length()-1)-'0');
        ListNode head = current;
        for (int i=sSum.length()-2;i>-1;i--){
            System.out.println(sSum.charAt(i)-'0');
            current.next = new ListNode(sSum.charAt(i)-'0');
            current = current.next;
        }
        return head;
    }
}


