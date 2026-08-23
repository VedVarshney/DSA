class Solution {
    public int arithmeticTriplets(int[] arr, int d) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            for(int k=i+2; k<arr.length; k++){
                if((arr[j]-arr[i]==d) && (arr[k]-arr[j]==d))
                c++;
            }
        }
    }    
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna