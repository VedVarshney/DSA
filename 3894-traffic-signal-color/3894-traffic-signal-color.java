class Solution {
    public String trafficSignal(int n) {
    if(n==0)
    return "Green";
    if(n==30)
    return "Orange";
    if(n>30 && n<=90)
    return "Red";
    else
    return "Invalid";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna