class Solution {
    public ListNode middleNode(ListNode head) {
    ListNode x=head;
    int n=0;
    while(x!=null){
        x=x.next;
        n++;
    }    
    x=head;
    for(int i=0; i<n/2; i++){
    x=x.next;
    }
    return x;
    }
}