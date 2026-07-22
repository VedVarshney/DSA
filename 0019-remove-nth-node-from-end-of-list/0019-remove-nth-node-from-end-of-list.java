class Solution {
    public ListNode removeNthFromEnd(ListNode head, int k) {
    ListNode x=head;
    int n=0;
    while(x!=null){
        x=x.next;
        n++;
    }  
    if(n==k){
    return head.next;   
    }
    x=head;
    for(int i=0; i<n-k-1; i++){
        x=x.next;
    }  
    x.next=x.next.next;
    return head;
    }
}