class Solution {
    public ListNode removeNthFromEnd(ListNode head, int k) {
    ListNode a=head;
    ListNode b=head;
    for(int i=0; i<k-1; i++){
    b=b.next;
    }
    if(b.next==null) return head.next;
    while(b.next.next!=null){
        a=a.next;
        b=b.next;
    }
    a.next=a.next.next;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna