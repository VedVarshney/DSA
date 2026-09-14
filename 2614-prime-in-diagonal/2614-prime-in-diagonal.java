class Solution {
    public boolean prime(int n){
        if(n<2) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] arr) {
    int mx=0;
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            if((i==j || (i+j)==arr.length-1) && prime(arr[i][j])){
            mx=Math.max(mx,arr[i][j]);
            }
        }
    }    
    return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna