class Solution {
    public String generateTheString(int n) {
    StringBuilder sb = new StringBuilder();
    if(n%2==1){
       for(int i=0; i<n; i++){
       sb.append('a');
       } 
       return sb.toString();
    }
    sb.setLength(0);
    for(int i=0; i<n-1; i++){
       sb.append('a');
    } 
    sb.append('z');
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna