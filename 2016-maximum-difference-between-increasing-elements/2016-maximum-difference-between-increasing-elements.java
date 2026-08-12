class Solution {
    public int maximumDifference(int[] arr) {
    int mx=-1;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]>arr[i])
            mx=Math.max(mx,arr[j]-arr[i]);
        }   
    }
    return mx; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna