class Solution {
    public boolean isPrefixString(String s, String[] arr) {
    String x="";
    for(int i=0; i<arr.length; i++){
        x+=arr[i];
        if(s.equals(x)) return true;
    }   
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna