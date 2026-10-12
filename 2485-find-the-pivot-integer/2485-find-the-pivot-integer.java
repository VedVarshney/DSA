class Solution {
    public int pivotInteger(int n) {
    int[] pre=new int[n];
    pre[0]=1;
    for(int i=1; i<n; i++){
        pre[i]=pre[i-1]+(i+1);
    }    
    for(int i=0; i<n; i++){
        int leftsum=pre[i];
        int rightsum=pre[n-1];
        if(i>0)
        rightsum=pre[n-1]-pre[i-1];
        if(leftsum==rightsum) return i+1;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna