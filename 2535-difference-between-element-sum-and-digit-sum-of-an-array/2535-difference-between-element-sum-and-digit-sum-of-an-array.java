class Solution {
    public int differenceOfSum(int[] arr) {
    int esum=0,dsum=0;
    for(int i=0; i<arr.length; i++){
        esum+=arr[i];
        int rm;
        while(arr[i]>0){
        rm=arr[i]%10;
        dsum+=rm;
        arr[i]/=10;
        }
    }    
    return Math.abs(esum-dsum);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna