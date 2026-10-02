class Solution {
    public int maximumStrongPairXor(int[] arr) {
    int n=arr.length;
    int ans=0;
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
        int x=arr[i];
        int y=arr[j];
        if(Math.abs(x-y)<=Math.min(x,y)){
        ans=Math.max(ans,(x^y));
        }
        }
    }
    return ans;
    }
}