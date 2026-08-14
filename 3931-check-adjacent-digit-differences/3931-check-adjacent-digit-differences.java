class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
    for(int i=0; i<s.length()-1; i++){
    int a=s.charAt(i)-48;
    int b=s.charAt(i+1)-48; 
    if(Math.abs(a-b)>2)
    return false;
    }  
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna