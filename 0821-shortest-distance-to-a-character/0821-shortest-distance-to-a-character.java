class Solution {
    public int[] shortestToChar(String s, char x) {
    int[] ans = new int[s.length()];
    for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        int a=Integer.MAX_VALUE;
        for(int j=0; j<s.length(); j++){
        if(s.charAt(j)==x){
        a=Math.min(a,Math.abs(i-j));
        }
        }
        ans[i]=a;
    }   
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna