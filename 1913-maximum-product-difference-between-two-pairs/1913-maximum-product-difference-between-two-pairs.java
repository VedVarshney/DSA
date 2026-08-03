class Solution {
    public int maxProductDifference(int[] arr) {
    Arrays.sort(arr);
    int ans=0;
    int n=arr.length;
    ans=(arr[n-1]*arr[n-2])-(arr[0]*arr[1]);
    return  ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna