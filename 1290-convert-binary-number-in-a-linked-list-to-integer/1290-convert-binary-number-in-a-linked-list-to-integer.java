class Solution {
    public int getDecimalValue(ListNode head) {
    ListNode temp=head;
    int n=0;
    while(temp!=null){
        temp=temp.next;
        n++;
    }  
    n--;   
    temp=head;
    int sum=0;
    while(temp!=null){
        sum+=temp.val*Math.pow(2,n--);
        temp=temp.next;
    }
    return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna