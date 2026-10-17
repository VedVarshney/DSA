class Solution {
    public int[] concatWithReverse(int[] arr) {
    int n=arr.length;
    int j=0;
    int[] ans = new int[2*n];
    for(int i=0; i<n; i++){
        ans[j++]=arr[i];
    }  
    for(int i=n-1; i>=0; i--){
        ans[j++]=arr[i];
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna