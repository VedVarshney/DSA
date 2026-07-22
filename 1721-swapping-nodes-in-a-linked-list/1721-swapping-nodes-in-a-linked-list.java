class Solution {
    public ListNode swapNodes(ListNode head, int k) {
    if(head.next==null)
    return head;
    ListNode fast=head;
    for(int i=0; i<k-1; i++){
        fast=fast.next;
    }    
    ListNode f=fast;
    ListNode slow=head;
    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    int t=f.val;
    f.val=slow.val;
    slow.val=t;
    return head;
    }
}