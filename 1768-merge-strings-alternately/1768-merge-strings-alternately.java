class Solution {
    public String mergeAlternately(String arr, String brr) {
    int i=0,j=0;
    int m=arr.length();
    int n=brr.length();
    StringBuilder sb = new StringBuilder();
    while(i<m && j<n){
        sb.append(arr.charAt(i));
        sb.append(brr.charAt(j));
        i++;
        j++;
    }
    if(i==m)
    sb.append(brr.substring(j));
    if(j==n)
    sb.append(arr.substring(i));
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna