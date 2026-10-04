class Solution {
    public int xorAllNums(int[] arr, int[] brr) {
    int ans=0;
    if((arr.length)%2==1){
       for(int i : brr) ans^=i;
        
    }
    if((brr.length)%2==1){
        for(int i : arr) ans^=i;
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna