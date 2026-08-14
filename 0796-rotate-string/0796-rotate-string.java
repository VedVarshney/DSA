class Solution {
    public boolean rotateString(String s, String g) {
    StringBuilder sb = new StringBuilder(s);
    for(int i=0; i<sb.length(); i++){
        if(sb.toString().equals(g))
        return true;
        char ch=sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(ch);
    }  
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna