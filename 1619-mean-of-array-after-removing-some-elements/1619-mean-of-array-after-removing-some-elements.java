class Solution {
    public double trimMean(int[] arr) {
    Arrays.sort(arr);
    int n=arr.length;
    int a=n/20; 
    int sum=0;
    for(int i=a; i<n-a; i++){
    sum+=arr[i];
    }  
    return (double)sum/(n-(2*a));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna