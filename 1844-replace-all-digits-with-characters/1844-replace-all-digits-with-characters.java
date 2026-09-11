class Solution {
    public String replaceDigits(String s) {
    StringBuilder sb = new StringBuilder(s);
    for(int i=1; i<sb.length(); i+=2){
    char c = (char)((int)sb.charAt(i-1)+(int)sb.charAt(i)-48);
    sb.setCharAt(i,c);
    }
    return sb.toString();    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna