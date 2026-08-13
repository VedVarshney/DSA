class Solution {
    public int minimumDistance(int[] arr) {
    int n=arr.length;
    int ans=Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            for(int k=j+1; k<n; k++){
            if(arr[i]==arr[j] && arr[j]==arr[k]){
            int s=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
            ans=Math.min(s,ans);
            }
            }
        }
    } 
    if(ans==Integer.MAX_VALUE) return -1;
    return ans;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna