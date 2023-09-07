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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> hm=new TreeMap<>();
        ListNode curr=head;
        while(curr!=null){
            if(!hm.containsKey(curr.val)){
                hm.put(curr.val,1);
            }
            else{
                hm.put(curr.val,hm.get(curr.val)+1);
            }
            curr=curr.next;
        }
        ListNode dd=new ListNode(-1);
        ListNode cu=dd;
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                ListNode nn=new ListNode(i);
                cu.next=nn;
                cu=cu.next;
            }
        }
        System.out.println(hm);
        return dd.next;
    }
}