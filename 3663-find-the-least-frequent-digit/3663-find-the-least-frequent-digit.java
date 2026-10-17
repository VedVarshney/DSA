class Solution {
    public int getLeastFrequentDigit(int n) {
    int[] frr = new int[10];   
    while(n>0){
        int rm=n%10;
        frr[rm]++;
        n/=10;
    } 
    int mn=Integer.MAX_VALUE;
    for(int i=0; i<10; i++){
        if(frr[i]!=0)
        mn=Math.min(mn,frr[i]);
    }
    for(int i=0; i<10; i++){
        if(mn==frr[i]) return i;
    }
    return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna