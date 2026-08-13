class Solution {
    public int missingMultiple(int[] arr, int k) {
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr){
        set.add(ele);
    }
    int i=k;
    while(i>0){
    if(!set.contains(i))
    return i;
    i+=k;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna