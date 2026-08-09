class Solution {
    public int count(int n){
        int rm,c=0;
        while(n>0){
            rm=n%10;
            c++;
            n/=10;
        }
        return c;
    }
    public int findNumbers(int[] arr) {
    int c=0;
    for(int ele : arr){
    if(count(ele)%2==0)
    c++;
    }   
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna