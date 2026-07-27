class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode*ans=new ListNode(-1);
        ListNode* k=ans;
        ListNode* i=l1,*j=l2;
        int carry=0;
        while(i!=NULL&&j!=NULL){
            int sum=i->val+j->val+carry;
            i=i->next;
            j=j->next;
            int value=sum%10;
            carry=sum/10;
            k->next=new ListNode(value);
            k=k->next;
        }
        while(i!=NULL){
            int sum=i->val+carry;
            i=i->next;
            int value=sum%10;
            carry=sum/10;
            k->next=new ListNode(value);
            k=k->next;
        }
        while(j!=NULL){
            int sum=j->val+carry;
            j=j->next;
            int value=sum%10;
            carry=sum/10;
            k->next=new ListNode(value);
            k=k->next;
        }
        if(carry!=0) k->next=new ListNode(carry);
        return ans->next;

    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna