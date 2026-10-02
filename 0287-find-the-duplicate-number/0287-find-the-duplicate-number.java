class Solution {
    public int findDuplicate(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr) {
        if(set.contains(ele)) return ele;
        else
        set.add(ele);
    } 
    return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna