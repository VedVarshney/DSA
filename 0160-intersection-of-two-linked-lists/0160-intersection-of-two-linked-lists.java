public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode A=headA;
    ListNode B=headB;   
    int a=0,b=0;
    while(A!=null){
        A=A.next;
        a++;
    } 
    while(B!=null){
        B=B.next;
        b++;
    }
    A=headA;
    B=headB;
    if(a>b){
    for(int i=0; i<a-b; i++)
        A=A.next;
    }else{
    for(int i=0; i<b-a; i++)
        B=B.next;
    }
    while(A!=B){
        A=A.next;
        B=B.next;
    }
    return A;
    }
}