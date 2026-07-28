class Solution {
    public boolean detectCapitalUse(String s) {
    int upper=0;
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            upper++;
    }   
    return (upper==s.length()|| upper==0 || (upper==1 && s.charAt(0)>='A'&& s.charAt(0)<='Z'));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna