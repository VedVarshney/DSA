class Solution {
    public int secondsBetweenTimes(String a, String b) {
    int secA=Integer.parseInt(a.substring(6));
    int secB=Integer.parseInt(b.substring(6));
    int minA=Integer.parseInt(a.substring(3,5));
    int minB=Integer.parseInt(b.substring(3,5));
    int hourA=Integer.parseInt(a.substring(0,2));
    int hourB=Integer.parseInt(b.substring(0,2));
    int totalA=hourA*3600+minA*60+secA;
    int totalB=hourB*3600+minB*60+secB;
    return totalB-totalA;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna