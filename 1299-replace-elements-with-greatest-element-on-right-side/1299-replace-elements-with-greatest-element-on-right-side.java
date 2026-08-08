class Solution {
    public int[] replaceElements(int[] arr) {
    int n = arr.length;
    int[] ans = new int[n];    
    ans[n-1]=-1;
    for(int i=0; i<n-1; i++){
        int mx=Integer.MIN_VALUE;
        for(int j=i+1; j<n; j++){
        if(arr[j]>mx){
            mx=arr[j];
        }
        }
        ans[i]=mx;
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna