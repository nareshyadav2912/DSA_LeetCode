/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode curr=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        ListNode d=new ListNode(-1);
        while(left<right){
            Collections.swap(al,left-1,right-1);
            left++;
            right--;
        }
        ListNode temp=d;
        for(int i=0;i<al.size();i++){
            ListNode cu=new ListNode(al.get(i));
            temp.next=cu;
            temp=temp.next;

        }
        System.out.println(al);
        return d.next;
    }
}