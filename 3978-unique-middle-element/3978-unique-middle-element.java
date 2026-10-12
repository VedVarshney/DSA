class Solution {
    public boolean isMiddleElementUnique(int[] arr) {
    int x=arr.length/2; 
    int c=0;
    for(int i=0; i<arr.length; i++){
        if(arr[x]==arr[i]) c++;
    }   
    if(c==1) return true;
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna