class Solution {
    public boolean checkDivisibility(int n) {
    int og=n;
    int ds=0,dp=1;
    while(n>0){
        ds+=n%10;
        dp*=n%10;
        n/=10;
    } 
    int x=ds+dp;
    if(og%(ds+dp)==0) return true;
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna