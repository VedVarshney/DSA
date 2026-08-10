class Solution {
    public int countNegatives(int[][] arr) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            if(arr[i][j]<0)
            c++;
        }
    } 
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna