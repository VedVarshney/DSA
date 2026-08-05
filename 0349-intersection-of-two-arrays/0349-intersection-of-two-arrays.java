class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1=new HashSet<>();
    HashSet<Integer> set2=new HashSet<>();
    for(int ele : nums1)
        set1.add(ele);
    for(int ele : nums2)
        set2.add(ele);
    ArrayList<Integer> al = new ArrayList<>();
    for(int ele :set1){
    if(set2.contains(ele))
    al.add(ele);
    }
    int[] ans=new int[al.size()];
    for(int i=0; i<al.size(); i++){
        ans[i]=al.get(i);
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna