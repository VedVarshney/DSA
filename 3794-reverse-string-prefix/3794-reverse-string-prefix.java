class Solution {
    public String reversePrefix(String s, int k) {
    StringBuilder sb = new StringBuilder(s);
    int i=0,j=k-1;
    while(i<j){
        char ch = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,ch);
        i++;
        j--;
    }     
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna