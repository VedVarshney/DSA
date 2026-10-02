class Solution {
    public int[] evenOddBit(int n) {
    int[] ans = new int[2];
    int even=0;
    int odd=0;
    StringBuilder sb = new StringBuilder();
    while(n>0){
        sb.append(n%2);
        n/=2;
    } 
    for(int i=0; i<sb.length(); i++){
        if(i%2==0){
           if(sb.charAt(i)=='1') even++;
        }else{
           if(sb.charAt(i)=='1') odd++;
        }
    }
    ans[0]=even;
    ans[1]=odd;
    return ans;
    }
}