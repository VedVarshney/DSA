class Solution {
    public int sumOfGoodNumbers(int[] arr, int k) {
    int s=0;
    for(int i=0; i<arr.length; i++){
        if((i-k)>=0 && (i+k)<arr.length){
        if(arr[i]>arr[i-k] && arr[i]>arr[i+k])
        s+=arr[i];
        }
        else if((i-k)<0 || (i+k)<arr.length){
        if(arr[i]>arr[i+k])
        s+=arr[i];
        }
        else{
        if(arr[i]>arr[i-k])
        s+=arr[i];
        }
    }   
    return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna