class Solution {
    public int numSpecial(int[][] arr) {
    int m=arr.length;
    int n=arr[0].length;
    int c=0;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(arr[i][j]!=1) continue;
            boolean rf=true,cf=true;
           for(int k=0; k<n; k++){
           if(k==j) continue;
           else if(arr[i][k]==1) {
            rf=false;
            break;
           }
           }
           for(int k=0; k<m; k++){
           if(k==i) continue;
            else if(arr[k][j]==1) {
            cf=false;
            break;
           }
           }
           if(cf && rf) c++;
        }
    }
    return c;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna