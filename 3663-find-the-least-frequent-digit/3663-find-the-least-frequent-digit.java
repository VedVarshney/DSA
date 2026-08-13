class Solution {
    public int getLeastFrequentDigit(int n) {
    int[] frr=new int[10];
    int rm;
    while(n>0){
        rm=n%10;
        frr[rm]++;
        n/=10;
    }
    int mn=Integer.MAX_VALUE;
    for(int i=0; i<10; i++){
    if(frr[i]>0 && frr[i]<mn)
    mn=frr[i];
    }
    for(int i=0; i<10; i++){
    if(frr[i]==mn)
    return i;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna