class Solution {
    public int findGCD(int[] arr) {
    int mn=Integer.MAX_VALUE;
    int mx=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>mx) mx=arr[i];
        if(arr[i]<mn) mn=arr[i];
    }
    for(int i=mn; i>=1; i--){
        if(mx%i==0 && mn%i==0)
        return i;
    }
    return 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna