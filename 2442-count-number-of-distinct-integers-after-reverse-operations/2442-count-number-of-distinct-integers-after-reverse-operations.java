class Solution {
    public int countDistinctIntegers(int[] arr){
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr){
        set.add(ele);
        int rv=0;
        while(ele>0){
            rv=rv*10+ele%10;
            ele/=10;
        }
        set.add(rv);
    }    
    return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna