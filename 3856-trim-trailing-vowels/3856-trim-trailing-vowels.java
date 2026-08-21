class Solution {
    public String trimTrailingVowels(String s) {
    StringBuilder sb = new StringBuilder(s);
    for(int i=sb.length()-1; i>=0; i--){
        char x=sb.charAt(i);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
        sb.deleteCharAt(i);
        else
        return sb.toString();
    }    
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna