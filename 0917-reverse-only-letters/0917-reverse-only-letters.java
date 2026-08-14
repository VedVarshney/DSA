class Solution {
    public String reverseOnlyLetters(String s) {
    StringBuilder sb = new StringBuilder(s);
    int i=0,j=sb.length()-1;
    while(i<j){
        int a=sb.charAt(i);
        int b=sb.charAt(j);
        if(!((a>=97 && a<=122) || (a>=65 && a<=90))) i++;
        else if(!((b>=97 && b<=122) || (b>=65 && b<=90))) j--;
        else{
            char ch = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);
            i++;
            j--;
        }
    }
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna