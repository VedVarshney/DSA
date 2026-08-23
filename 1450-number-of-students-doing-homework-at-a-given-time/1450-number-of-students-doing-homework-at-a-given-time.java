class Solution {
    public int busyStudent(int[] arr, int[] brr, int t) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]<=t && t<=brr[i])
        c++;
    } 
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna