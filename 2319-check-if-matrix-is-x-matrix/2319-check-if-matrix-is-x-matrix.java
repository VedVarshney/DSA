class Solution {
    public boolean checkXMatrix(int[][] arr) {
    int n=arr.length;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==j || (i+j==n-1)){
                if(arr[i][j]==0)
                return false;
            }else{
                if(arr[i][j]!=0)
                return false;
            }
            
        }
    }   
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna