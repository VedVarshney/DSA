class Solution {
    public long[] findPrefixScore(int[] arr) {
    long[] ans = new long[arr.length];
    int mx=arr[0];
    for(int i=0; i<arr.length; i++){
        mx=Math.max(arr[i],mx);
        ans[i]=(long)arr[i]+mx;
    }  
    for(int i=1; i<arr.length; i++){
        ans[i]+=ans[i-1];
    } 
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna