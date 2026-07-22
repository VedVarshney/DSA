class Solution {
    public ListNode swapNodes(ListNode head, int k) {
    ListNode x=head;
    int n=0;
    while(x!=null){
        x=x.next;
        n++;
    }
    x=head;
    for(int i=0; i<k-1; i++){
        x=x.next;
    }    
    ListNode y=head;
    for(int i=0; i<n-k; i++){
        y=y.next;
    }
    int t=x.val;
    x.val=y.val;
    y.val=t;
    return head;
    }
}