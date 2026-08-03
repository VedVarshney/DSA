class Solution {
    public int sumOfUnique(int[] arr) {
    int[] frq=new int[101];
    int sum=0;
    for(int ele:arr){
    frq[ele]++;
    }
    for(int ele : arr){
        if(frq[ele]==1)
        sum+=ele;
    }
    return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna