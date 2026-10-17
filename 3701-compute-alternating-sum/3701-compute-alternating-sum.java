class Solution {
    public int alternatingSum(int[] arr) {
    int ev=0,odd=0;
    for(int i=0; i<arr.length; i++){
        if(i%2==0) ev+=arr[i];
        else odd+=arr[i];
    }    
    return ev-odd;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna