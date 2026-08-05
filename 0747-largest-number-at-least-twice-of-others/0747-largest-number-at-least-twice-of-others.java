class Solution {
    public int dominantIndex(int[] arr) {
    int mx=arr[0];
    int ix=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>mx){
        mx=arr[i];
        ix=i;
    }
    }
    for(int i=0; i<arr.length; i++){
        if((arr[i]*2)>mx && i!=ix)
        return -1;
    }
    return ix;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna