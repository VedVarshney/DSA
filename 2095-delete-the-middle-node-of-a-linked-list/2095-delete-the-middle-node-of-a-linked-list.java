class Solution {
    public ListNode deleteMiddle(ListNode head) {
    if(head.next==null)
    return null; 
    ListNode x=head;
    int n=0;
    while(x!=null){
        x=x.next;
        n++;
    }   
    x=head;
    for(int i=0; i<n/2-1; i++){
    x=x.next;
    }
    x.next=x.next.next;
    return head;
    }
}