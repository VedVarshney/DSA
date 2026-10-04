class Solution {
    public boolean doesValidArrayExist(int[] drr) {
    int a=0;
    for(int ele : drr){
        a^=ele;
    }   
    return a==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna