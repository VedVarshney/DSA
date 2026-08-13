class Solution {
    public int[] recoverOrder(int[] orr, int[] frr) {
    HashSet<Integer> set = new HashSet<>();
    for(int ele : frr){
        set.add(ele);
    } 
    int[] ans = new int[frr.length];
    int j=0;
    for(int i=0; i<orr.length; i++){
    if(set.contains(orr[i]))
    ans[j++]=orr[i];
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna