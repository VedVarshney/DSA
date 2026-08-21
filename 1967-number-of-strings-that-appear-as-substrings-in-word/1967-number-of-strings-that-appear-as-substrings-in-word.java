class Solution {
    public int numOfStrings(String[] arr, String s) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        if(s.contains(arr[i]))
        c++;
    }   
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna