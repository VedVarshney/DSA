class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> arr) {
    List<Integer> al = new ArrayList<>();
    int[] frr=new int[101];
    for(int i=0; i<arr.size(); i++){
        frr[arr.get(i)]++;
    }
    for(int i=1; i<=100; i++){
       if(frr[i]%2==1) al.add(i);
    }
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna