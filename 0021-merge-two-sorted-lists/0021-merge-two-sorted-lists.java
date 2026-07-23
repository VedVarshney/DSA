class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode a=list1;
    ListNode b=list2;
    ListNode dummy = new ListNode(-1);
    ListNode c=dummy;
    while(a!=null && b!=null){
        if(a.val<b.val){
            c.next=a;
            a=a.next;
        }else{
            c.next=b;
            b=b.next;
        }
        c=c.next;
    }    
    if(a==null)
    c.next=b;
    else
    c.next=a;
    return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna