class Solution {
    public int maximumProduct(int[] arr) {
    int n=arr.length;
    Arrays.sort(arr);
    int f=arr[0]*arr[1]*arr[n-1];
    int l=arr[n-1]*arr[n-2]*arr[n-3];
    return Math.max(f,l);  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna