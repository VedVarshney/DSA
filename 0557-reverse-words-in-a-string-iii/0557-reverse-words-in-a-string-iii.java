class Solution {
    public void rev(StringBuilder sb,int i,int j){
        while(i<j){
        char ch=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,ch);
        i++;
        j--;
    } 
    }
    public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder(s);
    int i=0,j=0;
    while(j<sb.length()){
            if(sb.charAt(j)!=' '){
            j++;
            }else{
            rev(sb,i,j-1);
            i=j+1;
            j=i;
            }
        }
        rev(sb,i,j-1);
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna