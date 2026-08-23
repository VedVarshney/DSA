class Solution {
    public int maximumWealth(int[][] arr) {
    int mx=0;
    for(int i=0; i<arr.length; i++){
    int s=0;
       for(int j=0; j<arr[0].length; j++){
       s+=arr[i][j];
       }
       mx=Math.max(s,mx);
    }
    return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna