class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
    int n=arr.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
        if(map.containsKey(arr[i]) && Math.abs(map.get(arr[i])-i)<=k){
           return true;
        }
        else
           map.put(arr[i],i);
    }
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna