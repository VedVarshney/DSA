class Solution {
    public int firstStableIndex(int[] arr, int k) {
    int n=arr.length;
    int[] ans=new int[n];
    for(int i=0; i<n; i++){
    int mx=Integer.MIN_VALUE;
    int mn=Integer.MAX_VALUE;
    for(int j=0; j<=i; j++){
        if(arr[j]>mx) mx=arr[j];
    }
    for(int j=i; j<n; j++){
       if(arr[j]<mn) mn=arr[j];
    }
    ans[i]=mx-mn;
    } 
    for(int i=0; i<n; i++){
        if(ans[i]<=k) return i;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna